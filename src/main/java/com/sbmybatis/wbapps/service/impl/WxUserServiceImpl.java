package com.sbmybatis.wbapps.service.impl;

import com.sbmybatis.wbapps.comment.CommonResult;
import com.sbmybatis.wbapps.entity.WxUser;
import com.sbmybatis.wbapps.respository.WxUserRepository;
import com.sbmybatis.wbapps.service.interf.WxUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WxUserServiceImpl implements WxUserService {
    @Autowired
    private WxUserRepository wxUserRepository;
    private final static Logger LOGGER= LoggerFactory.getLogger(WxUserServiceImpl.class);
    @Override
    @Transactional
    public CommonResult synchWxUserForLib(WxUser wxUser) {
        CommonResult cr=new CommonResult();
        if (wxUserRepository.findWxUserByWxCode(wxUser.getWxCode())==null) {
            LOGGER.info("同步成功");
            wxUserRepository.save(wxUser);
        }
        else {
            cr.setMsg("已有用户不新增");
            LOGGER.info("已有用户不更新信息");
        }
        return cr;
    }

    @Override
    @Transactional
    public CommonResult updateWxUserInfoByBkUsered(String bookCode,String code) {
        CommonResult cr=new CommonResult();
        WxUser wxUser=wxUserRepository.findWxUserByWxCode(code);
        String bkUsered = wxUser.getBkUsered();
        String media=null;
        if(wxUser.getBkUsered()!=null){
             media=bkUsered.split("}")[0];
             media+=","+bookCode+"}";
            wxUser.setBkUsered(media);
        }else{
            media="{repl}";
            media.replaceFirst("repl",bookCode);
            wxUser.setBkUsered(media);
        }
        LOGGER.info("借用图书：--"+bookCode);
        wxUserRepository.saveAndFlush(wxUser);
        return cr;
    }
}

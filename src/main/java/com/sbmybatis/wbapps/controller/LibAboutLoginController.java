package com.sbmybatis.wbapps.controller;

import com.sbmybatis.wbapps.comment.CommonResult;
import com.sbmybatis.wbapps.entity.WxUser;
import com.sbmybatis.wbapps.service.interf.WxUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LibAboutLoginController {
    private final static Logger LOGGER=LoggerFactory.getLogger(LibAboutLoginController.class);
    @Autowired
    WxUserService wxUserService;
    private CommonResult saveUserInfoFromWX(  WxUser wxUser){

        return wxUserService.synchWxUserForLib(wxUser);
    }
    @GetMapping("/borrow")
    public CommonResult borrowOneBook(@RequestParam String bookCode,@RequestParam Long id){
        return wxUserService.updateWxUserInfoByBkUsered(bookCode,id);
    }

    /**
     * 登陆同步用户
     * @param code
     * @param request
     * @return
     */
    @RequestMapping("/login")
    public CommonResult toLogin(String code, HttpServletRequest request){
//        request.getSession().setAttribute("userCode",code);
        return new CommonResult();
    }
}

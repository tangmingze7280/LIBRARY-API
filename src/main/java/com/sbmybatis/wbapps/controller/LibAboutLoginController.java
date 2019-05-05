package com.sbmybatis.wbapps.controller;

import com.alibaba.fastjson.JSONObject;
import com.sbmybatis.wbapps.comment.CommonResult;
import com.sbmybatis.wbapps.comment.TenaWXLoginComment;
import com.sbmybatis.wbapps.entity.WxUser;
import com.sbmybatis.wbapps.service.interf.WxUserService;
import org.apache.tomcat.util.descriptor.web.WebXml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

@RestController
public class LibAboutLoginController {
    private final static Logger LOGGER=LoggerFactory.getLogger(LibAboutLoginController.class);
    private  static String check_url="https://api.weixin.qq.com/sns/jscode2session";
    private static String param="appid=wxd43a5f3dcfe15d39&secret=d99191de2f314f32e38aca7c29650332&grant_type=authorization_code&js_code=";
    @Autowired
    WxUserService wxUserService;
    private CommonResult saveUserInfoFromWX(  WxUser wxUser){

        return wxUserService.synchWxUserForLib(wxUser);
    }
    /*@GetMapping("/borrow")
    public CommonResult borrowOneBook(@RequestParam String bookCode,@RequestParam String code){
        return wxUserService.updateWxUserInfoByBkUsered(bookCode,code);
    }*/

    /**
     * 登陆同步用户
     * @param code
     * @param request
     * @return
     */
    @GetMapping("/login")
    public CommonResult toLogin(@RequestParam String code,@RequestParam String wxUser ,HttpServletRequest request){
        CommonResult cr =new CommonResult();
        param="appid=wxd43a5f3dcfe15d39&secret=d99191de2f314f32e38aca7c29650332&grant_type=authorization_code&js_code="+code;
        LOGGER.info("code:"+code);
        LOGGER.info("User:"+wxUser);
        Map<String,String> map=new HashMap<>();
        String result=TenaWXLoginComment.sendGet(check_url,param);
        Map<String,Object> xu=new HashMap<>();
        xu= JSONObject.parseObject(wxUser, Hashtable.class);

        WxUser wUser=new WxUser();
        wUser.setAvatarUrl(xu.get("avatarUrl")+"");
        wUser.setCity(xu.get("city")+"");
        wUser.setCountry(xu.get("country")+"");
        wUser.setGender(xu.get("gender")+"");
        wUser.setLanguage(xu.get("language")+"");
        wUser.setNickName(xu.get("nickName")+"");
        wUser.setProvince(xu.get("province")+"");
        LOGGER.info(wUser.toString());
        //{"session_key":"iH4RPvj9yMb7+JVk576Ylw==","openid":"oR5YB5SwlSZS0m-RqCXFMhkxAVr0"}
       try{
           map = JSONObject.parseObject(result, Hashtable.class);
           if(map.size()!=0){
               wUser.setId(2L);
               wUser.setWxCode(map.get("openid"));
               cr=wxUserService.synchWxUserForLib(wUser);
               cr.setData(wUser);
           }
           request.getSession().setAttribute("Auther",wUser.getWxCode());//生成session编码
       }catch (Exception e){
           LOGGER.error(e.getMessage());
           cr.setState(500);
           cr.setMsg("JSON转化出错");

       }
        LOGGER.info(result);
        return cr;
    }
}

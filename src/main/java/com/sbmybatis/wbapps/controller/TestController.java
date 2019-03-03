package com.sbmybatis.wbapps.controller;

import com.sbmybatis.wbapps.entity.UserInfo;
import com.sbmybatis.wbapps.service.interf.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private UserInfo userInfo;

    @Resource
    private UserInfoService userInfoService;

    /**
     * 获取所有用户
     *
     * @return
     */
    @GetMapping(value = "/getUserList")
    public List<UserInfo> getUserList() {
        return userInfoService.getUserList();
    }

    @GetMapping(value = "/getUserInfo")
    public UserInfo getUserInfoByName(@RequestParam("id") Long id) {
        return userInfoService.getUserByName(id);
    }

    @GetMapping(value = "/getCurrentUserList")
    public List<UserInfo> getCurrentUserList() {
        return userInfoService.getCurrentUserList();
    }

    @GetMapping(value = "/getPageUserList")
    public Page<UserInfo> getPageUserList() {
        return userInfoService.getPageUserList();
    }

    @GetMapping(value = "/addUserInfo")
    public UserInfo addUserInfo() {
        UserInfo userInfo=new UserInfo();
        userInfo.setCreateTime(new Date());
        userInfo.setId(1L);
        userInfo.setJobNumber("40");
        userInfo.setName("唐鸣泽");
        return userInfoService.addUserInfo(userInfo);
    }

    @PostMapping(value = "/updateUserInfo")
    public UserInfo updateUserInfo(UserInfo userInfo) {
        return userInfoService.updateUserInfoById(userInfo);
    }

    @PostMapping(value = "/deleteUserInfo")
    public void deleteUserInfo(@RequestParam("id") Long id) {
        userInfoService.deleteUserInfoById(id);
    }

    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));/*TimeZone时区，解决差8小时的问题*/
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
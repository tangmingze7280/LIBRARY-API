package com.sbmybatis.wbapps.controller;

import com.sbmybatis.wbapps.entity.User;
import com.sbmybatis.wbapps.service.interf.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {
    @Resource
    private UserService userService;
    @RequestMapping("getuser")
    public User getUser() {
        User user = new User();
        user.setId(213);
        return user;
    }
    @RequestMapping("getjdc")
    public User getJdc(){
        return userService.getUserById(1);
    }
}
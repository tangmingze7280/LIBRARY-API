package com.sbmybatis.wbapps.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibAboutLogin {
    @RequestMapping("")
    public String Login(){

        return null;
    }

    private boolean saveUserInfoFromWX(){
        return true;
    }
}

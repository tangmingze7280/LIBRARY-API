package com.sbmybatis.wbapps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/index")
public class ArravieController {
    @RequestMapping(value = "/hi")
    public String hi(){
        return "index";
    }
}

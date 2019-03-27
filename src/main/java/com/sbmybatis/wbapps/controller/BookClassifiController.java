package com.sbmybatis.wbapps.controller;

import com.sbmybatis.wbapps.entity.Classifications;
import com.sbmybatis.wbapps.service.interf.ClassifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/class")
public class BookClassifiController {
    @Autowired
    private ClassifService classifService;
    @GetMapping("/getAllClass")
    public List<Classifications> getAllClassType(){
        return null;
    }
}

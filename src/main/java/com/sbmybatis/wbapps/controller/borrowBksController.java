package com.sbmybatis.wbapps.controller;

import com.sbmybatis.wbapps.service.interf.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/borrow")
public class borrowBksController {
    @Autowired
    OrderService orderService;
    private static final Logger LOGGER= LoggerFactory.getLogger(borrowBksController.class);
//    public
}

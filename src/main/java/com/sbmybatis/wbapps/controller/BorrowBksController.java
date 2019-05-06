package com.sbmybatis.wbapps.controller;

import com.sbmybatis.wbapps.bean.RistBookMap;
import com.sbmybatis.wbapps.comment.CommonResult;
import com.sbmybatis.wbapps.entity.Orders;
import com.sbmybatis.wbapps.service.interf.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/borrow")
public class BorrowBksController {
    @Autowired
    OrderService orderService;
    private static final Logger LOGGER= LoggerFactory.getLogger(BorrowBksController.class);
    @RequestMapping("/blist")
    public CommonResult getBorrowListById(@RequestParam String wxId){
        CommonResult commonResult= new CommonResult();
        List<RistBookMap> borrowwList = orderService.getBorrowwList(wxId);
        LOGGER.info(borrowwList.toString());
        commonResult.setData(borrowwList);
        return  commonResult;
    }
    @RequestMapping("/badd")
    public CommonResult addOrderByParams(@RequestParam Map<String,Object> map){
        CommonResult commonResult =new CommonResult();
        Orders orders=new Orders();
        orders.setStatus(1);
        orders.setWechatUserId((String)map.get("wxId"));
        orders.setIsbn((String)map.get("bookId"));
        orders.setUpdatedAt(new Timestamp(new Date().getTime()));
        orders.setCreatedAt(new Timestamp(new Date().getTime()));
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DATE, 13);
        orders.setActualReturnTime(sdf.format(calendar.getTime()));//应还时间
        orders.setActualTakeTime("0");//逾期天数
        if(orderService.addOrderByParams(orders))
            commonResult.setMsg("借阅成功，13天");
        else
            commonResult.setMsg("不允许重复借阅");
        return commonResult;
    }
    @RequestMapping("/giveback")
    public CommonResult giveBackBook(@RequestParam Map<String,Object> map){
        boolean b = orderService.giveBackBook((String) map.get(""), (String) map.get(""));
        CommonResult commonResult=new CommonResult();
        commonResult.setMsg("还书成功");
        if(!b){
            commonResult.setMsg("还书失败");
        }
        return commonResult;
    }
    /*@RequestMapping("/getNotList")
    public CommonResult getNotReturnBookList(@RequestParam Map<String,Object> map){
        CommonResult commonResult=new CommonResult();
        List<Orders> notReturnBookList = orderService.getNotReturnBookList((String) map.get("wxId"));
        commonResult.setData(notReturnBookList);
        return commonResult;
    }*/
}

package com.sbmybatis.wbapps.controller;

import com.sbmybatis.wbapps.comment.CommonResult;
import com.sbmybatis.wbapps.entity.Books;
import com.sbmybatis.wbapps.service.interf.BookListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookListController {
    private final static Logger LOGGER= LoggerFactory.getLogger(BookListController.class);
    @Autowired
    private BookListService bookListService;
    @RequestMapping("/getBookInfoByBookName")
    public Books getBookInfoByBookName(@RequestParam String bookName){

        LOGGER.info(bookName);
        Books msg=bookListService.getBookListByTitle("%"+bookName+"%");
        LOGGER.info(msg.toString());
        return msg;
    }
    @RequestMapping("/getBookNameForSreach")
    public CommonResult getBookNameForSreach(@RequestParam  String simpleTitle){
        LOGGER.info(simpleTitle);
        CommonResult cr = new CommonResult();
        cr.setMsg("查询提示集合");
        List<String> resultList=bookListService.getBooksNamesByTitleLike(simpleTitle);
        cr.setData(resultList);
        if(resultList.size()>5){
            cr.setData(resultList.subList(0,5));
        }
        return cr;
    }

}

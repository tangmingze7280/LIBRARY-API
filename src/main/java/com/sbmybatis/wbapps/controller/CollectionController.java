package com.sbmybatis.wbapps.controller;

import com.alibaba.druid.util.DaemonThreadFactory;
import com.sbmybatis.wbapps.comment.CommonResult;
import com.sbmybatis.wbapps.entity.RecommendedBook;
import com.sbmybatis.wbapps.service.interf.RecomBookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

/**
 * 收藏控制器
 */
@RestController
@RequestMapping("/collection")
public class CollectionController {
    private final static Logger LOGGER= LoggerFactory.getLogger(CollectionController.class);
    @Autowired
    private RecomBookService recomBookService;
    @GetMapping("/updataCollection")
    public CommonResult updataCollection(@RequestParam String userCode,@RequestParam String bookCode){
        LOGGER.info(userCode,bookCode);
        CommonResult cr =new CommonResult();
        RecommendedBook recommendedBook=new RecommendedBook();
        recommendedBook.setWechatUserId(userCode);
        recommendedBook.setBookId(bookCode);
        if(recomBookService.updataUserConllectionByBooksCode(recommendedBook))
            cr.setMsg("收藏成功");
        else
            cr.setMsg("收藏失败");
        return cr;
    }

}

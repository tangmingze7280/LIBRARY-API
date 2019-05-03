package com.sbmybatis.wbapps.controller;

import com.alibaba.druid.util.DaemonThreadFactory;
import com.sbmybatis.wbapps.bean.BookMap;
import com.sbmybatis.wbapps.comment.CommonResult;
import com.sbmybatis.wbapps.entity.RecommendedBook;
import com.sbmybatis.wbapps.service.interf.RecomBookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.*;

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
        recommendedBook.setComment("");
        recommendedBook.setCreatedAt(new Timestamp(new Date().getTime()));
        recommendedBook.setUpdatedAt(new Timestamp(new Date().getTime()));
        if(recomBookService.checkOnlyItem(bookCode,userCode)){
            cr.setMsg("不能重复收藏");
            return cr;
        }
        if(recomBookService.updataUserConllectionByBooksCode(recommendedBook))
            cr.setMsg("收藏成功");
        else
            cr.setMsg("收藏失败");
        return cr;
    }
    @RequestMapping("/getCollectionsList")
    public CommonResult getConllectionsList(@RequestParam String userCode,@RequestParam Integer pageSize,@RequestParam Integer pageNum){
        List<Object[]> allBooksConByUserCode = recomBookService.findAllBooksConByUserCode(userCode, pageSize, pageNum);
        List<BookMap> reslist=new LinkedList<>();
        for(Object[] objs:allBooksConByUserCode)
            reslist.add(new BookMap((String)objs[1],(String)objs[0]));
        Map<String,Object> resMap=new Hashtable<>();
        CommonResult cr=new CommonResult();
        if (allBooksConByUserCode.size()!=0){
            resMap.put("resultList",reslist);
            resMap.put("pageSize",pageSize);
            resMap.put("pageNum",pageNum+1);
            cr.setMsg("查询成功！");
            cr.setData(resMap);
        }
        return cr;
    }
    @RequestMapping("/collection/deleteCollection")
    public CommonResult delConllectionByParam(@RequestParam String userCode,@RequestParam String bookCode){
        LOGGER.info(userCode,bookCode);
        return null;
    }
}

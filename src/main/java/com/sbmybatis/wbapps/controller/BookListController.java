package com.sbmybatis.wbapps.controller;

import com.sbmybatis.wbapps.comment.CommonResult;
import com.sbmybatis.wbapps.entity.Books;
import com.sbmybatis.wbapps.service.interf.BookListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/book")
public class BookListController {
    private final static Logger LOGGER= LoggerFactory.getLogger(BookListController.class);
    @Autowired
    private BookListService bookListService;
    @RequestMapping("/getBookInfoByBookName")
    public Books getBookInfoByBookName(@RequestParam String bookName){

//        LOGGER.info(bookName);
        Books msg=bookListService.getBookListByTitle(bookName).get(0);
//        LOGGER.info(msg.toString());
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
    @RequestMapping("/getBookInfoBySomeOne")
    public CommonResult getBookInfoBySomeOne(@RequestParam String classif,@RequestParam String runking,@RequestParam String history,@RequestParam String  collection,@RequestParam Integer pageSize,@RequestParam Integer pageNum){
        LOGGER.info(classif+":"+runking+":"+history+":"+collection+":"+pageNum+":"+pageSize);
        CommonResult cr =new CommonResult();
        List<Books> resList=new ArrayList<>();
        if(!StringUtils.isEmpty(classif))
//            LOGGER.info("分类查询");
            resList=bookListService.getBookListByClassif("%"+classif+"%",pageSize,pageNum);
        if(!StringUtils.isEmpty(runking))
            LOGGER.info("根据热度查询");
        if(!StringUtils.isEmpty(history))
            LOGGER.info("历史查询");
        if(!StringUtils.isEmpty(collection))
//            LOGGER.info("收藏查询");
            resList=bookListService.findAllBooksConllectionByUserCode(collection,pageSize,pageNum);
        cr.setData(resList);
        cr.setMsg("查询成功");
        return cr;
    }
   /* @RequestMapping("/getBookInfoBySomeOne")
    public CommonResult getBookInfoBySomeOne(@RequestParam Map<String,Object> map){
        LOGGER.info(map.size()+":"+map.get("classif1")+":"+map.get("runking")+":"+map.get("history")+":"+map.get("collection"));

        return null;
    }
*/

}

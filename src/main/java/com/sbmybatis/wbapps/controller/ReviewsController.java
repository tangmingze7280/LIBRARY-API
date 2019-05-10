package com.sbmybatis.wbapps.controller;

import com.sbmybatis.wbapps.comment.CommonResult;
import com.sbmybatis.wbapps.entity.Reviews;
import com.sbmybatis.wbapps.service.interf.ReviewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/reviews")
public class ReviewsController {
    @Autowired
    ReviewsService reviewsService;
    private static final String MODE_HOME = "null";
    private static final Logger log = LoggerFactory.getLogger(ReviewsController.class);

    @RequestMapping("/add")
    public CommonResult addReviews(@RequestParam Map<String, Object> map) {
        CommonResult commonResult = new CommonResult();
        Reviews reviews = new Reviews();
        reviews.setCreatedAt(new Timestamp(new Date().getTime()));
        reviews.setUpdatedAt(new Timestamp(new Date().getTime()));
        reviews.setBookId((String) map.get("bookId"));
        reviews.setWechatUserId((String) map.get("wxId"));
        reviews.setScore(Integer.valueOf((String) map.get("score")));
        reviews.setContent((String) map.get("content"));
        if (reviewsService.addReviewsForBooks(reviews))
            commonResult.setMsg("评论成功");
        else
            commonResult.setMsg("评论失败");
        return commonResult;

    }

    /**
     * 消失
     * @param map
     * @return
     */
    @RequestMapping("/del")
    public CommonResult delReviews(@RequestParam Map<String, Object> map) {
        CommonResult commonResult = new CommonResult();
        if (reviewsService.delReviewsForBooks((String) map.get("wxId"), (String) map.get("bookId"), (Integer) map.get("id")))
            commonResult.setMsg("删除成功");
        else
            commonResult.setMsg("删除失败");
        return commonResult;
    }

    @RequestMapping("/getListUser")
    public CommonResult getListUser(@RequestParam Map<String, Object> map) {
        CommonResult commonResult = new CommonResult();
        try {
            List reUserList = reviewsService.getReviewsListOfUserId((String) map.get("wxId"));
            commonResult.setData(reUserList);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return commonResult;
    }

    @RequestMapping("/getListbookId")
    public CommonResult getListbookId(@RequestParam Map<String, Object> map) {
        CommonResult commonResult = new CommonResult();
        List bookIdList = reviewsService.getReviewsListOfBooks((String) map.get("bookCode"));
        commonResult.setData(bookIdList);
        return commonResult;
    }

    @RequestMapping("/delListbookId")
    public CommonResult delListbookId(@RequestParam Map<String, Object> map) {
        CommonResult commonResult=new CommonResult();
        try{
            reviewsService.delListbookId((String)map.get("wxId"),Integer.valueOf((String)map.get("id")));
            commonResult.setMsg("删除成功");
        }catch (Exception e){
            e.printStackTrace();
            commonResult.setMsg("删除异常");
        }
        return commonResult;
    }
}

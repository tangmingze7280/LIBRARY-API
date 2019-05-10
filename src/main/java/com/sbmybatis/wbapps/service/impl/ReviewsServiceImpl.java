package com.sbmybatis.wbapps.service.impl;

import com.sbmybatis.wbapps.bean.ReviewsMap;
import com.sbmybatis.wbapps.entity.Reviews;
import com.sbmybatis.wbapps.respository.ReviewsRepository;
import com.sbmybatis.wbapps.service.interf.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
@Service
public class ReviewsServiceImpl implements ReviewsService {
    @Autowired
    ReviewsRepository reviewsRepository;
    @Override
    public boolean addReviewsForBooks(Reviews reviews) {
        try{
            reviewsRepository.save(reviews);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean delReviewsForBooks(String wxId, String bookId,Integer id) {
        try{
            reviewsRepository.deleteByWechatUserIdAndId( wxId,id);
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public List getReviewsListOfBooks(String bookId) {
        List<ReviewsMap> rlist=new LinkedList<>();
        List<Object[]> allByWechatUserIdByMyself = reviewsRepository.getAllByBookIdByMyself(bookId);
        for (Object[] op:allByWechatUserIdByMyself){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm;ss");
            Date date=(Date)op[5] ;
            ReviewsMap reviews = new ReviewsMap((String) op[0],(String) op[2],(Integer)op[3],(String)op[4],(String)op[1],(String)op[op.length-2],sdf.format(date),(Integer)op[op.length-1]);
            rlist.add(reviews);
        }
        return rlist;
    }

    @Override
    public List getReviewsListOfUserId(String wxId) {
        List<ReviewsMap> rlist=new LinkedList<>();
        List<Object[]> allByWechatUserIdByMyself = reviewsRepository.getAllByWechatUserIdByMyself(wxId);
        for (Object[] op:allByWechatUserIdByMyself){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm;ss");
            Date date=(Date)op[5] ;
            ReviewsMap reviews = new ReviewsMap((String) op[0],(String) op[2],(Integer)op[3],(String)op[4],(String)op[1],(String)op[op.length-2],sdf.format(date),(Integer)op[op.length-1]);
            rlist.add(reviews);
        }
        return rlist;
    }
    public void delListbookId(String wxId,Integer id){
        reviewsRepository.deleteByWechatUserIdAndId(wxId, id);
    }
}

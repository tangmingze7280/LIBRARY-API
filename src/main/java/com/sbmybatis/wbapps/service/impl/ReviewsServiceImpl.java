package com.sbmybatis.wbapps.service.impl;

import com.sbmybatis.wbapps.entity.Reviews;
import com.sbmybatis.wbapps.respository.ReviewsRepository;
import com.sbmybatis.wbapps.service.interf.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
            reviewsRepository.deleteByBookIdAndWechatUserIdAndId( wxId, bookId,id);
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public List getReviewsListOfBooks(String bookId) {

        return reviewsRepository.getAllByBookId(bookId);
    }

    @Override
    public List getReviewsListOfUserId(String wxId) {
        return reviewsRepository.getAllByWechatUserId(wxId);
    }
}

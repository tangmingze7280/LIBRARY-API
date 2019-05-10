package com.sbmybatis.wbapps.service.interf;

import com.sbmybatis.wbapps.entity.Reviews;

import java.util.List;

public interface ReviewsService {
    default  boolean addReviewsForBooks(Reviews reviews){
        return true;
    }
    default boolean delReviewsForBooks(String wxId,String bookId,Integer id){
        return true;
    }
    default List  getReviewsListOfBooks(String bookId){
        return null;
    }
    default List getReviewsListOfUserId(String wxId) {
        return null;
    }
}

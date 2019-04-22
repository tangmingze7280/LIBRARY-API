package com.sbmybatis.wbapps.service.interf;

import com.sbmybatis.wbapps.entity.Books;
import com.sbmybatis.wbapps.entity.RecommendedBook;

import java.util.List;

/**
 * 收藏接口
 */
public interface RecomBookService {
    default List<Books> findAllBooksConByUserCode(String userCode,int pageSize,int pageNum ){
        return null;
    }
    default boolean updataUserConllectionByBooksCode(RecommendedBook recommendedBook){
        return false;
    }

}

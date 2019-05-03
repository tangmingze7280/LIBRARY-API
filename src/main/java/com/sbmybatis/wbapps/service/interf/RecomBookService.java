package com.sbmybatis.wbapps.service.interf;

import com.sbmybatis.wbapps.bean.BookMap;
import com.sbmybatis.wbapps.entity.RecommendedBook;

import java.util.List;
import java.util.Map;

/**
 * 收藏接口
 */
public interface RecomBookService {
    default List<Object[]> findAllBooksConByUserCode(String userCode, int pageSize, int pageNum ){
        return null;
    }
    default boolean updataUserConllectionByBooksCode(RecommendedBook recommendedBook){
        return false;
    }
    public boolean  checkOnlyItem(String bookId,String userId);
}

package com.sbmybatis.wbapps.service.interf;

import com.sbmybatis.wbapps.entity.Books;

import java.util.List;

public interface BookListService {
    default  List<Books> getBookListByClassif(String classif,int pageSize,int pageNum){
        return null;
    }
    default List<Books> getBookListByTitle(String bookName){
        return null;
    }
    default List<String> getBooksNamesByTitleLike(String simpleTitle){
        return null;
    }
    List<Books> findAllBooksConllectionByUserCode(String userCode,int pageSize,int pageNum);
}

package com.sbmybatis.wbapps.service.impl;

import com.sbmybatis.wbapps.entity.Books;
import com.sbmybatis.wbapps.respository.BooksRepository;
import com.sbmybatis.wbapps.service.interf.BookListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookListServiceImpl implements BookListService {
    private final static Logger LOGGER= LoggerFactory.getLogger(BookListServiceImpl.class);
    @Autowired
    private BooksRepository booksRepository;
    @Override
    public List<Books> getBookListByClassif(String classif,int pageSize,int pageNum) {
        PageRequest pageRequest=new PageRequest(pageNum,pageSize);
        List<Books> allByClassNum = booksRepository.findAllByClassNumLike(classif, pageRequest);
        LOGGER.info(allByClassNum.toString());
        return allByClassNum;
    }

    @Override
    public Books getBookListByTitle(String bookName) {
        return booksRepository.findBooksByTitleLikeAndIdMAX(bookName);
    }
    @Override
    public List<String> getBooksNamesByTitleLike(String simpleTitle) {
        return booksRepository.findBooksNamesByTitleLike(simpleTitle);
    }

    @Override
    public List<Books> findAllBooksConllectionByUserCode(String userCode, int pageSize, int pageNum) {
        return booksRepository.findAllBooksConllectionByUserCode(userCode,pageNum,pageSize);
    }
}

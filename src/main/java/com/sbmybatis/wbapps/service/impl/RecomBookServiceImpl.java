package com.sbmybatis.wbapps.service.impl;

import com.sbmybatis.wbapps.entity.Books;
import com.sbmybatis.wbapps.entity.RecommendedBook;
import com.sbmybatis.wbapps.respository.RecomBookRepository;
import com.sbmybatis.wbapps.service.interf.RecomBookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("recomBookService")
public class RecomBookServiceImpl implements RecomBookService {
    private final static Logger LOGGER= LoggerFactory.getLogger(RecomBookServiceImpl.class);
    @Autowired
    private RecomBookRepository recomBookRepository;


    @Override
    public List<Books> findAllBooksConByUserCode(String userCode, int pageSize,int pageNum ) {

        return null;
    }

    @Override
    public boolean updataUserConllectionByBooksCode(RecommendedBook recommendedBook) {
        LOGGER.info(recommendedBook.toString());
        RecommendedBook savePoint = recomBookRepository.save(recommendedBook);
        return savePoint.getBookId().equals(null)&&savePoint.getBookId().equals("");
    }
}

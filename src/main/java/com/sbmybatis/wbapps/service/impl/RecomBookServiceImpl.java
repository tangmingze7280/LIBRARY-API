package com.sbmybatis.wbapps.service.impl;

import com.sbmybatis.wbapps.bean.BookMap;
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
import java.util.Map;

@Service("recomBookService")
public class RecomBookServiceImpl implements RecomBookService {
    private final static Logger LOGGER= LoggerFactory.getLogger(RecomBookServiceImpl.class);
    @Autowired
    private RecomBookRepository recomBookRepository;


    @Override
    public List<Object[]> findAllBooksConByUserCode(String userCode, int pageSize,int pageNum ) {
        List<Object[]> allByWechatUserId = recomBookRepository.getAllByAllOfTwoTab(userCode,pageNum*pageSize, pageSize);
        return allByWechatUserId;
    }

    @Override
    public boolean updataUserConllectionByBooksCode(RecommendedBook recommendedBook) {
        LOGGER.info(recommendedBook.toString());
        RecommendedBook savePoint = recomBookRepository.save(recommendedBook);
        return savePoint.getBookId().equals(null)&&savePoint.getBookId().equals("");
    }
    public boolean  checkOnlyItem(String bookId,String userId){
        List list=recomBookRepository.findByBookIdAndAndWechatUserId(bookId,userId);
        return list.size()!=0;
    }
}

package com.sbmybatis.wbapps.respository;

import com.sbmybatis.wbapps.bean.BookMap;
import com.sbmybatis.wbapps.entity.Books;
import com.sbmybatis.wbapps.entity.RecommendedBook;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;


import java.util.List;
import java.util.Map;

public interface RecomBookRepository extends JpaRepository<RecommendedBook,Integer>, JpaSpecificationExecutor<RecommendedBook>, PagingAndSortingRepository<RecommendedBook,Integer> {
    List<RecommendedBook> findByBookIdAndAndWechatUserId(String bookId,String wechatUserId);
    @Query(value = "SELECT b.title as title ,b.isbn as isbn FROM recommended_book r join books b on r.book_id=b.isbn WHERE r.wechat_user_id=?1 limit ?2,?3"
            ,nativeQuery = true)
    List<Object[]> getAllByAllOfTwoTab(String wechartUserId  , Integer pageNum, Integer pageSize);
    Integer deleteRecommendedBookByBookIdAndWechatUserId(String userCode,String bookCode);
}

package com.sbmybatis.wbapps.respository;

import com.sbmybatis.wbapps.entity.BookInfo;
import com.sbmybatis.wbapps.entity.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * JpaRepository<T,ID> T是表映射对象 ID 是主键类型
 * JpaSpecificationExecutor<T></>多表查询
 */
@Transactional
public interface ReviewsRepository extends JpaRepository<Reviews,Integer> , JpaSpecificationExecutor<Reviews> {
    List getAllByWechatUserId(String wxId);
    List getAllByBookId(String bookId);
    @Modifying
    void deleteByBookIdAndWechatUserIdAndId(String wxId, String bookId,Integer id);
}

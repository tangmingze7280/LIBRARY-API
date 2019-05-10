package com.sbmybatis.wbapps.respository;

import com.sbmybatis.wbapps.entity.BookInfo;
import com.sbmybatis.wbapps.entity.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * JpaRepository<T,ID> T是表映射对象 ID 是主键类型
 * JpaSpecificationExecutor<T></>多表查询
 */
@Transactional
public interface ReviewsRepository extends JpaRepository<Reviews,Integer> , JpaSpecificationExecutor<Reviews> {
    @Query(value="SELECT w.wx_code,w.avatar_url,r.content,r.score,w.nick_name,r.created_at,b.title ,r.id FROM books b, reviews r join wx_user w on w.wx_code=r.wechat_user_id  where r.wechat_user_id=?1 and b.isbn=r.book_id ",nativeQuery = true)
    List<Object[]> getAllByWechatUserIdByMyself(String wxId);
    @Query(value=" SELECT w.wx_code,w.avatar_url,r.content,r.score,w.nick_name,r.created_at,b.title,r.id FROM wx_user w, reviews r join books b  on b.isbn=r.book_id   where r.book_id=?1  ",nativeQuery = true)
    List<Object[]> getAllByBookIdByMyself(String bookId);
    @Modifying
    void deleteByBookIdAndWechatUserIdAndId(String wxId, String bookId,Integer id);
}

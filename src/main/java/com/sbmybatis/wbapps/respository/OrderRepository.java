package com.sbmybatis.wbapps.respository;

import com.sbmybatis.wbapps.entity.Orders;
import com.sbmybatis.wbapps.entity.WxUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

/**
 * JpaRepository<T,ID> T是表映射对象 ID 是主键类型
 */
@Transactional
public interface OrderRepository extends JpaRepository<Orders,Integer> {
    @Modifying
    @Query(value = "update orders  set status=0 ,deleted_at=?3 where isbn=?2 and wechat_user_id=?1  ",nativeQuery = true)
    public Integer giveBackBook(String wxCode, String bookId, Timestamp timestamp);
    @Modifying
    @Query(value = "update orders  set renew_count=?1 ,actual_take_time=?4 where isbn=?3 and wechat_user_id=?2  ",nativeQuery = true)
    public Integer renewBook(String renewCount,String wxCode, String bookId,String updateTime );
}

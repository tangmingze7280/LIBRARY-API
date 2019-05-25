package com.sbmybatis.wbapps.respository;

import com.sbmybatis.wbapps.entity.Orders;
import com.sbmybatis.wbapps.entity.WxUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

/**
 * JpaRepository<T,ID> T是表映射对象 ID 是主键类型
 */
@Transactional
public interface OrderRepository extends JpaRepository<Orders,Integer> {
    /**
     * actual_return_time为null才是归还了
     * @param wxCode
     * @param bookId
     * @param timestamp
     * @param finePaied 是否预期的判断  null是未还
     * @param overdue 逾期天数
     * @return
     */
    @Modifying
    @Query(value = "update orders  set status=0 ,deleted_at=?3 ,is_fine_paied=?4,actual_take_time=?5,actual_return_time=null where isbn=?2 and wechat_user_id=?1  ",nativeQuery = true)
    public Integer giveBackBook(String wxCode, String bookId, Timestamp timestamp,Integer finePaied,String overdue);
    @Modifying
    @Query(value = "update orders  set renew_count=?1 ,actual_take_time=?4 where isbn=?3 and wechat_user_id=?2  ",nativeQuery = true)
    public Integer renewBook(String renewCount,String wxCode, String bookId,String updateTime );
    List<Orders> getAllByWechatUserId(String wechatUserId);
    @Query(value="SELECT o.id,o.status,o.isbn,o.actual_return_time,b.title,o.is_fine_paied FROM orders o join books b  " +
            " on o.isbn=b.isbn where o.wechat_user_id=?;" ,nativeQuery = true)
    List<Object[]> getBookListRistByParam(String wechatUserId);
    Orders getOrdersByWechatUserIdAndIsbn(String wechartUserId,String isbn);
    List<Orders> getAllByWechatUserIdAndActualReturnTimeIsNotNullAndFineIsNull(String wechartUserId);
    Integer countDistinctByWechatUserId(String wechatUserId);
}

package com.sbmybatis.wbapps.service.interf;

import com.sbmybatis.wbapps.entity.Orders;

import java.sql.Timestamp;

/**
 * 借书   （订单）
 * @date 2019/05/03
 * @tmz
 */
public interface OrderService {
    /**
     * 新增订单 （！）
     * @param orders
     * @return
     */
    default  public boolean addOrderByParams(Orders orders){
      return true;
    }
    /**
     *  update
     * @param wxCode
     * @param bookId
     * @param timestamp
     * @return
     */
    default public boolean giveBackBook(String wxCode, String bookId, Timestamp timestamp){
        return true;
    }

    /**
     *  update
     *  ps:延期
     * @param wxCode
     * @param bookId
     * @return
     */
    default public boolean renewBook(String renewCount,String wxCode, String bookId,String updateTime ){
        return true;
    }
}

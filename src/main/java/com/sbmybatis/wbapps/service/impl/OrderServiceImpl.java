package com.sbmybatis.wbapps.service.impl;

import com.sbmybatis.wbapps.entity.Orders;
import com.sbmybatis.wbapps.respository.OrderRepository;
import com.sbmybatis.wbapps.service.interf.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Override
    public boolean addOrderByParams(Orders orders) {

        return orderRepository.save(orders)!=null;
    }

    @Override
    public boolean giveBackBook(String wxCode, String bookId, Timestamp timestamp) {
        return orderRepository.giveBackBook( wxCode,  bookId,  timestamp)>0;
    }

    @Override
    public boolean renewBook(String renewCount,String wxCode, String bookId,String updateTime ) {
        return orderRepository.renewBook( renewCount, wxCode,  bookId, updateTime )>0;
    }
}

package com.sbmybatis.wbapps.service.impl;

import com.sbmybatis.wbapps.entity.Orders;
import com.sbmybatis.wbapps.respository.OrderRepository;
import com.sbmybatis.wbapps.service.interf.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Override
    public boolean addOrderByParams(Orders orders) {
        if(orderRepository.getOrdersByWechatUserIdAndIsbn(orders.getWechatUserId(),orders.getIsbn())!=null)
            return false;
        return orderRepository.save(orders)!=null;
    }

    @Override
    public boolean giveBackBook(String wxCode, String bookId) {
        Orders order = orderRepository.getOrdersByWechatUserIdAndIsbn(wxCode, bookId);
        String actualReturnTime = order.getActualReturnTime();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        int a=0;// 0 是未预期 1是逾期
        String overDue="0";//逾期天数  默认未0
        try{
            long ls=new Date().getTime();
            long bes=sdf.parse(actualReturnTime).getTime();
            if(ls>bes) {
                a = 1;
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(new Date());
                int day1=calendar.get(Calendar.DAY_OF_YEAR);
                calendar.setTime(sdf.parse(actualReturnTime));
                int day2=calendar.get(Calendar.DAY_OF_YEAR);
                overDue=Math.abs(day1-day2)+"";
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return orderRepository.giveBackBook( wxCode,  bookId,  new Timestamp(new Date().getTime()),a,overDue)>0;
    }

    @Override
    public boolean renewBook(String renewCount,String wxCode, String bookId,String updateTime ) {
        return orderRepository.renewBook( renewCount, wxCode,  bookId, updateTime )>0;
    }

    @Override
    public List<Orders> getBorrowwList(String wechatUserId) {
        return orderRepository.getAllByWechatUserId(wechatUserId);
    }
}

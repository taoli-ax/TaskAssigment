package com.coh.dao;

import com.coh.pojo.Orders;
import com.coh.pojo.OrdersVO;

import java.util.List;

public interface OrderDao {
    void create(Orders order);
    List<OrdersVO> findAll();


}

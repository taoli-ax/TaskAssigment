package com.coh.service;

import com.coh.pojo.Orders;
import com.coh.pojo.OrdersVO;

import java.util.List;

public interface OrderService {
    void create(Orders order);
    List<OrdersVO> findAll();
}

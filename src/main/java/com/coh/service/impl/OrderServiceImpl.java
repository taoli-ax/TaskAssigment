package com.coh.service.impl;

import com.coh.dao.OrderDao;
import com.coh.pojo.Orders;
import com.coh.pojo.Orders;
import com.coh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Override
    public void create(Orders order) {
        orderDao.create(order);

    }

}

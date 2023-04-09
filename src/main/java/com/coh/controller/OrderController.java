package com.coh.controller;

import com.coh.pojo.Order;
import com.coh.service.OrderService;
import org.apache.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("new")
    public @ResponseBody Map<String,Object> newOrder(Order order){
        System.out.println(order);
        Map<String,Object>map=new HashMap<>();
        order.setCreateDate(new Date());

        try {
            orderService.create(order);
            map.put("result",true);
        }catch (Exception e){
            e.printStackTrace();
            map.put("result",false);
        }
        return map;
    }
}

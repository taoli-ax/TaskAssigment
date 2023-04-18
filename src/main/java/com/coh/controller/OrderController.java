package com.coh.controller;
import com.coh.pojo.Orders;
import com.coh.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
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
    @ResponseBody
    public Map<String,Object> newOrder(@Validated Orders order, Errors errors){
        System.out.println(order);
        Map<String,Object>map=new HashMap<>();
        if(errors!=null&&errors.getFieldErrors().size()>0){
            for(FieldError fieldError:errors.getFieldErrors()){
                map.put(fieldError.getField()+"Message",fieldError.getDefaultMessage());
            }
            map.put("result",false);
            return map;
        }
        order.setCreate_at(new Date());
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

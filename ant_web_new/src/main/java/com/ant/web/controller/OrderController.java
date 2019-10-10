package com.ant.web.controller;

import com.ant.web.bean.Result;
import com.ant.web.entity.Order;
import com.ant.web.request.GoodsForm;
import com.ant.web.request.OrderForm;
import com.ant.web.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lic
 * @data: 2019/10/10
 */
@RequestMapping("order")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("list")
    public Result list(@RequestBody OrderForm form) {
        return orderService.list(form);
    }


    @RequestMapping("remark")
    public Result remark(@RequestBody Order order) {
        return orderService.remark(order);
    }


}

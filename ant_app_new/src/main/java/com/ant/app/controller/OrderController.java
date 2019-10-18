package com.ant.app.controller;

import com.ant.app.bean.Result;
import com.ant.app.request.OrderSubmitRequest;
import com.ant.app.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * @Author: lic
 * @data: 2019/10/14
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * @des 订单列表
     * @author lic
     * @data 2019/10/18
     * @param userId
     * @param state
     * @return com.ant.app.bean.Result
     **/
    @RequestMapping("list")
    public Result list(@SessionAttribute int userId, @Param("state") String state) {
        return orderService.list(userId, state);
    }

    /**
     * @des 提交订单
     * @author lic
     * @data 2019/10/18
     * @param userId
     * @param orderSubmitRequest
     * @return com.ant.app.bean.Result
     **/
    @RequestMapping("submit")
    public Result submit(@SessionAttribute int userId, @RequestBody OrderSubmitRequest orderSubmitRequest) {
        orderSubmitRequest.setUserId(userId);
        return orderService.submit(orderSubmitRequest);
    }



}

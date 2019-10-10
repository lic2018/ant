package com.ant.web.controller;

import com.ant.web.bean.Result;
import com.ant.web.request.OrderForm;
import com.ant.web.service.OrderRefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lic
 * @data: 2019/10/10
 */
@RequestMapping("orderRefund")
@RestController
public class OrderRefundController {

    @Autowired
    private OrderRefundService orderRefundService;

    @RequestMapping("list")
    public Result list(@RequestBody OrderForm form) {
        return orderRefundService.list(form);
    }

    @RequestMapping("update")
    public Result update(@RequestBody OrderForm form) {
        return orderRefundService.update(form);
    }

}

package com.ant.web.service.impl;

import com.ant.web.bean.Result;
import com.ant.web.dao.OrderDao;
import com.ant.web.entity.Order;
import com.ant.web.entity.User;
import com.ant.web.exception.CodeableException;
import com.ant.web.exception.ExceptionCode;
import com.ant.web.request.OrderForm;
import com.ant.web.response.OrderResponse;
import com.ant.web.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lic
 * @data: 2019/10/10
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderDao orderDao;

    @Override
    public Result list(OrderForm form) {
        PageHelper.startPage(form.getPageIndex(), form.getPageSize());
        List<OrderResponse> list = orderDao.list(form);
        PageInfo<OrderResponse> pageInfo = new PageInfo<>(list);
        return Result.success(pageInfo);
    }

    @Override
    public Result remark(Order order) {
        int update = orderDao.updateByPrimaryKeySelective(order);
        if (update != 1) {
            throw new CodeableException(ExceptionCode.EX_SQL);
        }
        return Result.success();
    }
}

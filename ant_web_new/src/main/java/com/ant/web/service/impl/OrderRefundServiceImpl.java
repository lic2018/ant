package com.ant.web.service.impl;

import com.ant.web.bean.Result;
import com.ant.web.dao.OrderRefundDao;
import com.ant.web.entity.OrderRefund;
import com.ant.web.entity.User;
import com.ant.web.request.OrderForm;
import com.ant.web.service.OrderRefundService;
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
public class OrderRefundServiceImpl implements OrderRefundService {

    @Autowired
    private OrderRefundDao orderRefundDao;

    @Override
    public Result update(OrderForm form) {
        return null;
    }

    @Override
    public Result list(OrderForm form) {
        PageHelper.startPage(form.getPageIndex(), form.getPageSize());
        List<OrderRefund> list = orderRefundDao.list(form);
        PageInfo<OrderRefund> pageInfo = new PageInfo<>(list);
        return Result.success(pageInfo);
    }
}

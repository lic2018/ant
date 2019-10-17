package com.ant.app.service.impl;

import com.ant.app.bean.Result;
import com.ant.app.dao.OrderDao;
import com.ant.app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lic
 * @data: 2019/10/14
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Result list(int userId, String state) {
        orderDao.list(userId, state);
        return null;
    }
}

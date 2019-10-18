package com.ant.app.service.impl;

import com.ant.app.bean.Result;
import com.ant.app.dao.OrderDao;
import com.ant.app.dao.OrderGoodsDao;
import com.ant.app.entity.Order;
import com.ant.app.entity.OrderGoods;
import com.ant.app.request.OrderSubmitRequest;
import com.ant.app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: lic
 * @data: 2019/10/14
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private OrderGoodsDao orderGoodsDao;

    @Override
    public Result list(int userId, String state) {
        List<Order> orderList = orderDao.list(userId, state);
        return Result.success(orderList);
    }

    @Transactional
    @Override
    public Result submit(OrderSubmitRequest orderSubmitRequest) {
        orderDao.insert(orderSubmitRequest);
        orderGoodsDao.insertBatch(orderSubmitRequest.getGoodsList());
        return Result.success();
    }


}

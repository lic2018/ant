package com.ant.web.dao;

import com.ant.web.entity.Order;
import com.ant.web.request.OrderForm;
import com.ant.web.response.OrderResponse;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * OrderDao继承基类
 */
@Repository
public interface OrderDao extends MyBatisBaseDao<Order, String> {
    List<OrderResponse> list(OrderForm form);
}
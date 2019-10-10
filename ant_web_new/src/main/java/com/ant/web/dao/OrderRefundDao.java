package com.ant.web.dao;

import com.ant.web.entity.OrderRefund;
import com.ant.web.request.OrderForm;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * OrderRefundDao继承基类
 */
@Repository
public interface OrderRefundDao extends MyBatisBaseDao<OrderRefund, Integer> {
    List<OrderRefund> list(OrderForm form);
}
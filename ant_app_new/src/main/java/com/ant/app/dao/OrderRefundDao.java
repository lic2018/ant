package com.ant.app.dao;

import com.ant.app.entity.OrderRefund;
import org.springframework.stereotype.Repository;

/**
 * OrderRefundDao继承基类
 */
@Repository
public interface OrderRefundDao extends MyBatisBaseDao<OrderRefund, Integer> {
}
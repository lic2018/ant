package com.ant.app.dao;

import com.ant.app.entity.Order;
import org.springframework.stereotype.Repository;

/**
 * OrderDao继承基类
 */
@Repository
public interface OrderDao extends MyBatisBaseDao<Order, String> {
}
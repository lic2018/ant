package com.ant.app.dao;

import com.ant.app.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * OrderDao继承基类
 */
@Repository
public interface OrderDao extends MyBatisBaseDao<Order, String> {
    List<Order> list(int userId, String state);
}
package com.ant.app.dao;

import com.ant.app.entity.OrderGoods;
import org.springframework.stereotype.Repository;

/**
 * OrderGoodsDao继承基类
 */
@Repository
public interface OrderGoodsDao extends MyBatisBaseDao<OrderGoods, Integer> {
}
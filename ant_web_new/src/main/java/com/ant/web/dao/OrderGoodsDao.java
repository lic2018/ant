package com.ant.web.dao;

import com.ant.web.entity.OrderGoods;
import org.springframework.stereotype.Repository;

/**
 * OrderGoodsDao继承基类
 */
@Repository
public interface OrderGoodsDao extends MyBatisBaseDao<OrderGoods, Integer> {
}
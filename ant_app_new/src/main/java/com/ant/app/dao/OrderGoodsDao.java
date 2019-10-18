package com.ant.app.dao;

import com.ant.app.entity.Goods;
import com.ant.app.entity.OrderGoods;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * OrderGoodsDao继承基类
 */
@Repository
public interface OrderGoodsDao extends MyBatisBaseDao<OrderGoods, Integer> {
    void insertBatch(List<Goods> goodsList);
}
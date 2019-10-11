package com.ant.app.dao;

import com.ant.app.entity.Goods;
import org.springframework.stereotype.Repository;

/**
 * GoodsDao继承基类
 */
@Repository
public interface GoodsDao extends MyBatisBaseDao<Goods, Integer> {
}
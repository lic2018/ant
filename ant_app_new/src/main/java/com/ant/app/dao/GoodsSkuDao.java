package com.ant.app.dao;

import com.ant.app.entity.GoodsSku;
import org.springframework.stereotype.Repository;

/**
 * GoodsSkuDao继承基类
 */
@Repository
public interface GoodsSkuDao extends MyBatisBaseDao<GoodsSku, Integer> {
}
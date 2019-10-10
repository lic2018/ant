package com.ant.web.dao;

import com.ant.web.entity.GoodsSku;
import org.springframework.stereotype.Repository;

/**
 * GoodsSkuDao继承基类
 */
@Repository
public interface GoodsSkuDao extends MyBatisBaseDao<GoodsSku, Integer> {
}
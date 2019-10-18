package com.ant.app.dao;

import com.ant.app.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * GoodsDao继承基类
 */
@Repository
public interface GoodsDao extends MyBatisBaseDao<Goods, Integer> {
    Goods findById(@Param("goodsId") int goodsId);

}
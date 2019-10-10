package com.ant.web.dao;

import com.ant.web.entity.Goods;
import com.ant.web.entity.User;
import com.ant.web.request.GoodsForm;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * GoodsDao继承基类
 */
@Repository
public interface GoodsDao extends MyBatisBaseDao<Goods, Integer> {
    List<User> list(GoodsForm form);
}
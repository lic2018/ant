package com.ant.app.dao;

import com.ant.app.entity.ShoppingCart;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ShoppingCartDao继承基类
 */
@Repository
public interface ShoppingCartDao extends MyBatisBaseDao<ShoppingCart, Integer> {
    List<ShoppingCart> list(int userId);

    int delete(int userId, String ids);
}
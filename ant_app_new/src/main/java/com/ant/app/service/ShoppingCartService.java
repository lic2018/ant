package com.ant.app.service;

import com.ant.app.bean.Result;
import com.ant.app.entity.ShoppingCart;

/**
 * @Author: lic
 * @data: 2019/10/16
 */
public interface ShoppingCartService {
    Result list(int userId);

    Result add(ShoppingCart shoppingCart);

    Result delete(int userId, String ids);
}

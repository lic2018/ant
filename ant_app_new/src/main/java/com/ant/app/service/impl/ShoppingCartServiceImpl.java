package com.ant.app.service.impl;

import com.ant.app.bean.Result;
import com.ant.app.dao.ShoppingCartDao;
import com.ant.app.entity.ShoppingCart;
import com.ant.app.exception.CodeableException;
import com.ant.app.exception.ExceptionCode;
import com.ant.app.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 购物车
 * @Author: lic
 * @data: 2019/10/16
 */
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

    @Autowired
    private ShoppingCartDao shoppingCartDao;


    @Override
    public Result list(int userId) {
        List<ShoppingCart> list = shoppingCartDao.list(userId);
        return Result.success(list);
    }


    @Override
    public Result add(ShoppingCart shoppingCart) {
        int insert = shoppingCartDao.insert(shoppingCart);
        if (insert != 1) {
            throw new CodeableException(ExceptionCode.EX_SQL);
        }
        return Result.success();
    }


    @Override
    public Result delete(int userId, String ids) {
        int delete = shoppingCartDao.delete(userId, ids);
        if (delete != 1) {
            throw new CodeableException(ExceptionCode.EX_SQL);
        }
        return Result.success();
    }

}

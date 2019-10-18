package com.ant.app.controller;

import com.ant.app.bean.Result;
import com.ant.app.entity.ShoppingCart;
import com.ant.app.service.ShoppingCartService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * 购物车
 *
 * @Author: lic
 * @data: 2019/10/16
 */
@RestController
@RequestMapping("shoppingCart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    /**
     * @des 列表
     * @author lic
     * @data 2019/10/18
     * @param userId
     * @return com.ant.app.bean.Result
     **/
    @RequestMapping("list")
    public Result list(@SessionAttribute int userId) {
        return shoppingCartService.list(userId);
    }

    /**
     * @des 加入购物车
     * @author lic
     * @data 2019/10/18
     * @param shoppingCart
     * @return com.ant.app.bean.Result
     **/
    @RequestMapping("add")
    public Result add(@RequestBody ShoppingCart shoppingCart) {
        return shoppingCartService.add(shoppingCart);
    }

    /**
     * @des 商品移除购物车
     * @author lic
     * @data 2019/10/18
     * @param userId
     * @param ids
     * @return com.ant.app.bean.Result
     **/
    @RequestMapping("delete")
    public Result delete(@SessionAttribute int userId, @Param("ids") String ids) {
        return shoppingCartService.delete(userId, ids);
    }


}

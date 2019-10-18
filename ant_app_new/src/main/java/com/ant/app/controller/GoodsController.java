package com.ant.app.controller;

import com.ant.app.bean.Result;
import com.ant.app.service.GoodsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * @Author: lic
 * @data: 2019/10/14
 */
@RestController
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    @RequestMapping("detail")
    public Result detail(@Param("goodsId") int goodsId) {
        return goodsService.detail(goodsId);
    }
}

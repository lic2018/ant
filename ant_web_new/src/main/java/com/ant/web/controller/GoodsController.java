package com.ant.web.controller;

import com.ant.web.bean.Result;
import com.ant.web.entity.Goods;
import com.ant.web.request.BaseForm;
import com.ant.web.request.GoodsForm;
import com.ant.web.service.GoodsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lic
 * @data: 2019/10/10
 */
@RequestMapping("goods")
@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("list")
    public Result list(@RequestBody GoodsForm form) {
        return goodsService.list(form);
    }

    @RequestMapping("update")
    public Result update(@RequestBody Goods goods) {
        return goodsService.update(goods);
    }

    @RequestMapping("off")
    public Result off(@RequestBody Goods goods) {
        return goodsService.off(goods);
    }

    @RequestMapping("detail")
    public Result detail(@RequestBody Goods goods) {
        return goodsService.detail(goods);
    }


}

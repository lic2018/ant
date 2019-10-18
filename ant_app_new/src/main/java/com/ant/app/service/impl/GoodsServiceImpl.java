package com.ant.app.service.impl;

import com.ant.app.bean.Result;
import com.ant.app.dao.GoodsDao;
import com.ant.app.entity.Goods;
import com.ant.app.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lic
 * @data: 2019/10/14
 */
@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Result detail(int goodsId) {
        Goods goods = goodsDao.findById(goodsId);
        return Result.success(goods);
    }


}

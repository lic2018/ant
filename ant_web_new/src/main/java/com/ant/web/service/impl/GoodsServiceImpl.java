package com.ant.web.service.impl;

import com.ant.web.bean.Result;
import com.ant.web.dao.GoodsDao;
import com.ant.web.entity.Goods;
import com.ant.web.entity.User;
import com.ant.web.exception.CodeableException;
import com.ant.web.exception.ExceptionCode;
import com.ant.web.request.GoodsForm;
import com.ant.web.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lic
 * @data: 2019/10/10
 */
@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Result list(GoodsForm form) {
        PageHelper.startPage(form.getPageIndex(), form.getPageSize());
        List<User> list = goodsDao.list(form);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return Result.success(pageInfo);
    }

    @Override
    public Result update(Goods goods) {
        int update = goodsDao.updateByPrimaryKeySelective(goods);
        if (update != 1) {
            throw new CodeableException(ExceptionCode.EX_SQL);
        }
        return null;
    }

    @Override
    public Result off(Goods goods) {
        int update = goodsDao.updateByPrimaryKeySelective(goods);
        if (update != 1) {
            throw new CodeableException(ExceptionCode.EX_SQL);
        }
        return Result.success();
    }

    @Override
    public Result detail(Goods goods) {
        Goods goods1 = goodsDao.selectByPrimaryKey(goods.getId());
        return Result.success(goods1);
    }
}

package com.ant.web.service;

import com.ant.web.bean.Result;
import com.ant.web.entity.Goods;
import com.ant.web.request.GoodsForm;

/**
 * @Author: lic
 * @data: 2019/10/10
 */
public interface GoodsService {
    Result list(GoodsForm form);

    Result update(Goods goods);

    Result off(Goods goods);

    Result detail(Goods goods);
}

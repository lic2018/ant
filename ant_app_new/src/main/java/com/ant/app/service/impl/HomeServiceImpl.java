package com.ant.app.service.impl;

import com.ant.app.bean.Result;
import com.ant.app.dao.ActiveDao;
import com.ant.app.entity.Active;
import com.ant.app.service.HomeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: lic
 * @data: 2019/10/12
 */
@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private ActiveDao activeDao;

    @Override
    public Result mainContext() {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("banner", activeDao.findActiveByType("1"));
        map.put("icon", activeDao.findActiveByType("2"));
        map.put("activities", activeDao.findActiveByType("3"));


        return Result.success(map);
    }
}

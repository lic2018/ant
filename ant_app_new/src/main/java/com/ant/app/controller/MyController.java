package com.ant.app.controller;

import com.ant.app.bean.Result;
import com.ant.app.entity.Advise;
import com.ant.app.entity.User;
import com.ant.app.entity.UserAddress;
import com.ant.app.service.MyService;
import com.ant.app.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.Date;

/**
 * @Author: lic
 * @data: 2019/10/12
 */
@RestController
@RequestMapping("my")
public class MyController {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private MyService myService;

    @RequestMapping("invitation")
    public Result invitation(@SessionAttribute int userId) {
        return myService.invitation(userId);
    }


    @RequestMapping("addressList")
    public Result addressList(@SessionAttribute int userId) {
        return myService.addressList(userId);
    }

    @RequestMapping("addressAdd")
    public Result addressAdd(@SessionAttribute int userId, UserAddress address) {
        address.setUserId(userId);
        return myService.addressAdd(address);
    }

    @RequestMapping("addressUpdate")
    public Result addressUpdate(UserAddress address) {
        return myService.addressUpdate(address);
    }

    @RequestMapping("addAdvise")
    public Result addAdvise(@SessionAttribute int userId, Advise advise) {
        User user = RedisUtil.getUser(redisTemplate, userId);
        advise.setUserId(user.getId());
        advise.setUserNickname(user.getNickname());
        advise.setCreateTime(new Date());
        return myService.addAdvise(advise);
    }


}

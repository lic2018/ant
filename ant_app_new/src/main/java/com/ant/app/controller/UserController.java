package com.ant.app.controller;

import cn.hutool.core.util.RandomUtil;
import com.ant.app.bean.Result;
import com.ant.app.constant.RedisEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author: lic
 * @data: 2019/10/11
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("getAuthCode")
    public Result getAuthCode(@RequestParam("tel") String tel) {
        int randomInt = RandomUtil.randomInt(6);
        stringRedisTemplate.opsForValue().set(RedisEnum.AuthCode.getPrefix(), "12", RedisEnum.AuthCode.getTime(), TimeUnit.SECONDS);
        // 发送短信

        return Result.success();
    }


}

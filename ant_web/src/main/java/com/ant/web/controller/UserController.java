package com.ant.web.controller;

import com.ant.bean.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @RequestMapping("test")
    public Result test(HttpSession sess) {
        sess.setAttribute("aa", "123");
        String id = sess.getId();
        Object aa = sess.getAttribute("aa");
        return Result.success(aa);
    }


}

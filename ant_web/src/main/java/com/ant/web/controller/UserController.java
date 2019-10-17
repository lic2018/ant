package com.ant.web.controller;

import com.ant.bean.Result;
import com.ant.web.entity.User;
import com.ant.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
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

    @Autowired
    private UserService userService;

    @RequestMapping("test")
    public Result test(HttpSession sess) {
//        sess.setAttribute("aa", "123");
//        String id = sess.getId();
//        Object aa = sess.getAttribute("aa");
//        return Result.success(aa);
        throw new RuntimeException();
    }


    @RequestMapping("getAll")
    public Result getAll(@RequestBody User user) {
        Result result = userService.getAll(user);
        return result;
    }
}

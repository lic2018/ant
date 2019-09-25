package com.ant.web.controller;

import com.ant.bean.Result;
import com.ant.web.entity.User;
import com.ant.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lic
 * @data: 2019/9/19
 */
@RestController
public class LoginController {
    @Autowired
    private UserService userService;


//    @RequestMapping("/login_p")
//    public Result loginP() {
//        return Result.failure(300, "尚未登录，请登录!");
//    }
//
//    @RequestMapping("/login")
//    public Result login(@RequestBody User user) {
//        Result result = userService.login(user);
//        return Result.success(result);
//    }

}

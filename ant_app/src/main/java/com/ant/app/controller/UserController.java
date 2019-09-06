package com.ant.app.controller;

import com.ant.app.entity.Role;
import com.ant.app.service.UserService;
import com.ant.bean.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findById")
    public Result findById(@RequestParam("id") Integer id) {
        Role role = userService.findById(id);
        return Result.success(role);
    }


    @RequestMapping("insert")
    public String insert(@RequestBody Role role) {
        Integer integer = userService.insert(role);
        return integer.toString();
    }

}

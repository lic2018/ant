package com.ant.web.controller;

import com.ant.web.bean.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lic
 * @data: 2019/9/29
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("getUser")
    @ResponseBody
    public Result getUser() {
        if (1==1) {
            throw new RuntimeException();
        }
        return Result.success();
    }

}

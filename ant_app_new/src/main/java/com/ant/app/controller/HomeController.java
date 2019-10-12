package com.ant.app.controller;

import cn.hutool.core.util.RandomUtil;
import com.ant.app.bean.Result;
import com.ant.app.constant.RedisEnum;
import com.ant.app.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.concurrent.TimeUnit;

/**
 * @Author: lic
 * @data: 2019/10/12
 */
@RestController
@RequestMapping("home")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping("mainContext")
    public Result mainContext() {
        homeService.mainContext();
        return Result.success();
    }
}

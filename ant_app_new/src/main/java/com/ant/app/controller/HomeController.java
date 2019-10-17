package com.ant.app.controller;

import com.ant.app.bean.Result;
import com.ant.app.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return homeService.mainContext();
    }
}

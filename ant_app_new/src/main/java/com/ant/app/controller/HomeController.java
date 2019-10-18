package com.ant.app.controller;

import com.ant.app.bean.Result;
import com.ant.app.service.HomeService;
import com.ant.app.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * @Author: lic
 * @data: 2019/10/12
 */
@RestController
@RequestMapping("home")
public class HomeController {

    @Autowired
    private HomeService homeService;
    @Autowired
    private MessageService messageService;

    /**
     * @des 首页数据
     * @author lic
     * @data 2019/10/18
     * @param 
     * @return com.ant.app.bean.Result
     **/
    @RequestMapping("mainContext")
    public Result mainContext(@SessionAttribute int userId) {
        messageService.insertNew(userId);
        return homeService.mainContext();
    }


}

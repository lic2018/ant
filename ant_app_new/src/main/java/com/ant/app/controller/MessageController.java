package com.ant.app.controller;

import com.ant.app.bean.Result;
import com.ant.app.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * @Author: lic
 * @data: 2019/10/14
 */
@RestController
@RequestMapping("message")
public class MessageController {

    @Autowired
    private MessageService messageService;


    /*
     * 消息列表
     * @author lic
     * @data 2019/10/16
     * @param [userId]
     * @return com.ant.app.bean.Result
     */
    @RequestMapping("list")
    public Result list(@SessionAttribute int userId) {
        return messageService.list(userId);
    }

    /*
     * 清空消息列表
     * @author lic
     * @data 2019/10/16
     * @param [userId]
     * @return com.ant.app.bean.Result
     */
    @RequestMapping("empty")
    public Result empty(@SessionAttribute int userId) {
        return messageService.empty(userId);
    }



}

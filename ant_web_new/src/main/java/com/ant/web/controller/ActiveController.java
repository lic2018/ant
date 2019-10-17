package com.ant.web.controller;

import com.ant.web.bean.Result;
import com.ant.web.entity.Active;
import com.ant.web.request.ActiveForm;
import com.ant.web.service.ActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lic
 * @data: 2019/10/11
 */
@RequestMapping("active")
@RestController
public class ActiveController {

    @Autowired
    private ActiveService activeService;

    @RequestMapping("list")
    public Result list(@RequestBody ActiveForm form) {
        return activeService.list(form);
    }

    @RequestMapping("delete")
    public Result delete(@RequestBody Active active) {
        return activeService.delete(active);
    }

    @RequestMapping("update")
    public Result update(@RequestBody Active active) {
        return activeService.update(active);
    }
}

package com.ant.web.controller;

import com.ant.web.bean.Result;
import com.ant.web.entity.User;
import com.ant.web.request.ApplicationForm;
import com.ant.web.request.MustForm;
import com.ant.web.request.RegisterForm;
import com.ant.web.response.UserResponse;
import com.ant.web.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * 用户管理
 *
 * @Author: lic
 * @data: 2019/9/29
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @param username 用户名
     * @param password 密码
     * @return com.ant.web.bean.Result
     * @des 登录
     * @author lic
     * @data 2019/10/25
     **/
    @RequestMapping("login")
    public Result login(@RequestParam(value = "username", required = true) String username, @RequestParam(value = "password", required = true) String password,
                        HttpSession session) {
        UserResponse userResponse = userService.login(username, password);
        session.setAttribute("userId", userResponse.getId());
        return Result.success(userResponse);
    }

    @RequestMapping("must")
    public Result must(@RequestBody MustForm form, HttpSession session, @SessionAttribute int userId) {
        boolean b = userService.must(form);
        log.info("userId:" + userId);
        log.info(session.getAttribute("userId").toString());
        return Result.success(b);
    }

    @RequestMapping("registerList")
    public Result registerList(@RequestBody RegisterForm form) {
        return userService.registerList(form);
    }

    @RequestMapping("applicationList")
    public Result applicationList(@RequestBody ApplicationForm form) {
        return userService.applicationList(form);
    }

    @RequestMapping("registerChange")
    public Result registerChange(@RequestBody User user) {
        return userService.registerChange(user);
    }

    // 消费金额没加
    @RequestMapping("registerDetail")
    public Result registerDetail(@Param("id") Integer id) {
        return userService.registerDetail(id);
    }

    @RequestMapping("applicationUpdate")
    public Result applicationUpdate(@Param("id") Integer id, @Param("userId") Integer userId) {
        return userService.applicationUpdate(id, userId);
    }
}

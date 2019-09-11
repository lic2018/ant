package com.ant.web.controller;

import cn.hutool.core.util.RandomUtil;
import com.ant.app.Request.LoginRequest;
import com.ant.app.entity.User;
import com.ant.app.service.UserService;
import com.ant.bean.Result;
import com.ant.constant.RedisConst;
import com.ant.exception.CodeException;
import com.ant.exception.ExceptionCode;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.concurrent.TimeUnit;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    StringRedisTemplate stringRedisTemplate;


    @RequestMapping("test")
    public Result test(HttpSession sess) {
        sess.setAttribute("aa","123");
        String id = sess.getId();
        Object aa = sess.getAttribute("aa");
        return Result.success(aa);
    }


    // 获取验证码
    @RequestMapping("securityCode")
    public Result securityCode(@RequestBody User user) {
        String numbers = RandomUtil.randomNumbers(4);
        stringRedisTemplate.opsForValue().set(RedisConst.redisType.SECURITY+user.getUsername(),numbers,RedisConst.redisTime.SECURITY, TimeUnit.MINUTES);
        return Result.success(numbers);
    }

    // 登录
    @RequestMapping("login")
    public Result login(@RequestBody LoginRequest loginRequest) {
        String sercurityCode = stringRedisTemplate.opsForValue().get(RedisConst.redisType.SECURITY + loginRequest.getUsername());
        if (StringUtils.isBlank(sercurityCode)) {
            throw new CodeException(ExceptionCode.EX_CODE_LOSE_EFFICACY);
        }
        if (!sercurityCode.equals(loginRequest.getSecurityCode())) {
            throw new CodeException(ExceptionCode.EX_CODE_ERROR);
        }
        userService.login(loginRequest);
        return Result.success();
    }

    // 首页数据
    @RequestMapping("home")
    public Result home(@RequestBody LoginRequest loginRequest) {
        return Result.success();
    }

}

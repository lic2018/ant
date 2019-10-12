package com.ant.app.controller;

import cn.hutool.core.util.RandomUtil;
import com.ant.app.bean.Result;
import com.ant.app.constant.RedisEnum;
import com.ant.app.entity.User;
import com.ant.app.exception.CodeableException;
import com.ant.app.exception.ExceptionCode;
import com.ant.app.service.UserService;
import com.sun.corba.se.spi.ior.IdentifiableFactory;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.concurrent.TimeUnit;

/**
 * @Author: lic
 * @data: 2019/10/11
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private UserService userService;

    /*
     * 获取验证码
     * @author lic
     * @data 2019/10/12
     * @param [tel, invitationCode]
     * @return com.ant.app.bean.Result
     */
    @RequestMapping("getAuthCode")
    public Result getAuthCode(@RequestParam(value = "tel", required = true) String tel, HttpSession session) {
        int randomInt = RandomUtil.randomInt(6);
        String a = randomInt + "";
        stringRedisTemplate.opsForValue().set(RedisEnum.AuthCode.getPrefix() + session.getId(), randomInt + "", RedisEnum.AuthCode.getTime(), TimeUnit.SECONDS);
        // 发送短信

        return Result.success();
    }

    /*
     * 绑定
     * @author lic
     * @data 2019/10/12
     * @param [invitationCode]
     * @return com.ant.app.bean.Result
     */
    @RequestMapping("binding")
    public Result binding(@RequestParam(value = "tel", required = true) String tel,@RequestParam(value = "authCode", required = true) String authCode,
                          @RequestParam(value = "invitationCode") String invitationCode,HttpSession session) {

        String sessionAuthCode = stringRedisTemplate.opsForValue().get(RedisEnum.AuthCode.getPrefix() + session.getId());
        if (!authCode.equals(sessionAuthCode)) {
            throw new CodeableException(ExceptionCode.EX_AUTHCODE_ERROE);
        }
        return userService.binding(tel, invitationCode);
    }



}

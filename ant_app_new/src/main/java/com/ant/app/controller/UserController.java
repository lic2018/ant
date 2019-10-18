package com.ant.app.controller;

import cn.hutool.core.util.RandomUtil;
import com.ant.app.bean.Result;
import com.ant.app.constant.RedisEnum;
import com.ant.app.entity.User;
import com.ant.app.entity.UserApplication;
import com.ant.app.exception.CodeableException;
import com.ant.app.exception.ExceptionCode;
import com.ant.app.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.concurrent.TimeUnit;

/**
 * @Author: lic
 * @data: 2019/10/11
 */
@RestController
@RequestMapping("user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private UserService userService;

    /**
     * @des 获取验证码
     * @author lic
     * @data 2019/10/18
     * @param tel 手机号
     * @param session
     * @return com.ant.app.bean.Result
     **/
    @RequestMapping("getAuthCode")
    public Result getAuthCode(@RequestParam(value = "tel", required = true) String tel, HttpSession session) {
        int randomInt = RandomUtil.randomInt(6);
        stringRedisTemplate.opsForValue().set(RedisEnum.AuthCode.getPrefix() + session.getId(), randomInt + "", RedisEnum.AuthCode.getTime(), TimeUnit.SECONDS);
        // 发送短信
        LOGGER.info("AuthCode:" + randomInt);
        return Result.success();
    }

    /**
     * @Description 登录或绑定
     * @author lic
     * @data 2019/10/18
     * @param tel 手机号
     * @param authCode 验证码
     * @param invitationCode 邀请码
     * @param wechatCode 微信号
     * @param session
     * @return com.ant.app.bean.Result
     **/
    @RequestMapping("loginOrbinding")
    public Result loginOrbinding(@RequestParam(value = "tel", required = true) String tel, @RequestParam(value = "authCode", required = true) String authCode,
                                 @RequestParam(value = "invitationCode") String invitationCode, @RequestParam(value = "wechatCode") String wechatCode, HttpSession session) {

        String sessionAuthCode = stringRedisTemplate.opsForValue().get(RedisEnum.AuthCode.getPrefix() + session.getId());
        if (sessionAuthCode == null) {
            throw new CodeableException(ExceptionCode.EX_AUTHCODE_OVERDUE_ERROE);
        }
        if (!authCode.equals(sessionAuthCode)) {
            throw new CodeableException(ExceptionCode.EX_AUTHCODE_ERROE);
        }

        User user = userService.loginOrbinding(tel, invitationCode, wechatCode);
        session.setAttribute("userId", user.getId());
        return Result.success(user);
    }

    /**
     * @des 用户协议
     * @author lic
     * @data 2019/10/18
     * @param
     * @return com.ant.app.bean.Result
     **/
    @RequestMapping("userAgreement")
    public Result userAgreement() {
        return userService.userAgreement();
    }

    /**
     * @des applyForColonel
     * @author lic
     * @data 2019/10/18
     * @param userId
     * @param realname 真实姓名
     * @param tel 手机号
     * @param wechatCode 微信号
     * @return com.ant.app.bean.Result
     **/
    /**
     * @des applyForColonel
     * @author lic
     * @data 2019/10/18
     * @param userId
     * @param userApplication
     * @return com.ant.app.bean.Result
     **/
    @RequestMapping("applyForColonel")
    public Result applyForColonel(@SessionAttribute int userId, @RequestBody UserApplication userApplication) {
        userApplication.setUserId(userId);
        return userService.applyForColonel(userApplication);
    }


}

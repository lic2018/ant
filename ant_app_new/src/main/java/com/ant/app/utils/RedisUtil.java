package com.ant.app.utils;

import com.ant.app.constant.RedisEnum;
import com.ant.app.constant.UserConst;
import com.ant.app.entity.User;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @Author: lic
 * @data: 2019/10/12
 */
public class RedisUtil {

    public static User getUser(RedisTemplate redisTemplate, int userId) {
        User u = (User) redisTemplate.opsForValue().get(RedisEnum.AppUser.getPrefix() + userId);
        return u;
    }
}

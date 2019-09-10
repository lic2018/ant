package com.ant.constant;

/**
 * @Author: lic
 * @data: 2019/9/10
 */
public interface RedisConst {

    interface redisType {
        String SECURITY = "security_"; // 验证码
    }

    interface redisTime {
        long SECURITY = 10;
    }
}

package com.ant.app.constant;

/**
 * @Author: lic
 * @data: 2019/10/11
 */
public enum RedisEnum {

    AuthCode ( "AuthCode_", 5 * 60L),
    ;

    private String prefix;
    private long time; // 单位都为秒

    RedisEnum(String prefix, Long time) {
        this.prefix = prefix;
        this.time = time;
    }


    public String getPrefix() {
        return prefix;
    }

    public Long getTime() {
        return time;
    }
}

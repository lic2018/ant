package com.ant.web.exception;

/**
 * @author lic
 * @des 自定义异常枚举
 * @data 2019/11/13
 * @return
 **/
public enum ExceptionCode {


    EX_USER_USERNAME_PASSWORD(10003, "账号或密码错误"),

    EX_USER_NOT_FOUND(10004, "该用户不存在"),

    EX_SQL(50001, "SQL执行异常"),
    EX_SYSTEM(99999, "系统异常");


    public int code;
    public String exception;

    private ExceptionCode(int code) {
        this.code = code;
    }

    private ExceptionCode(int code, String exception) {
        this.code = code;
        this.exception = exception;
    }

    public int getCode() {
        return code;
    }

    public String getException() {
        return exception;
    }
}
package com.ant.web.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
public final class Result {
    private static Logger logger = LoggerFactory.getLogger(Result.class);
    private int code;
    private String message;
    private Object data;

    private Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public static Result success() {
        return success(null);
    }

    public static Result success(Object data) {
        Result result = new Result(200, null, data);
        return result;
    }

    public static Result failure() {
        return new Result(500, "请求异常", null);
    }

    public static Result failure(int code, String message) {
        return new Result(code, message, null);
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
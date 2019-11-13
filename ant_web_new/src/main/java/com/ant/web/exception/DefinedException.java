package com.ant.web.exception;


/**
 * 自定义的异常，定义指定的错误码
 */
public class DefinedException extends RuntimeException {

    private ExceptionCode exceptionCode;

    private int code;

    private String message;

//    public DefinedException(String column, ExceptionCode exceptionCode) {
//        super(column + ":" + exceptionCode.getException());
//        this.exceptionCode = exceptionCode;
//        this.code = exceptionCode.getCode();
//        this.message = exceptionCode.getException();
//    }

    public DefinedException(ExceptionCode exceptionCode) {
        this.exceptionCode = exceptionCode;
        this.code = exceptionCode.getCode();
        this.message = exceptionCode.getException();
    }

    public ExceptionCode getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(ExceptionCode exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

package com.ant.web.controller;

import com.ant.web.bean.Result;
import com.ant.web.exception.DefinedException;
import com.ant.web.exception.ExceptionCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

/**
 * 异常捕获返回前端统一格式
 *
 * @Author: lic
 * @data: 2019/11/13
 */
@RestControllerAdvice
public class RestExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * @param ex
     * @return com.zpkj.ddw.vo.Result
     * @des 自定义异常捕获
     * @author lic
     * @data 2019/11/13
     **/
    @ExceptionHandler({DefinedException.class})
    public Result handleCodeable(DefinedException ex) {
        logger.error("CodeException: {}({})", ex.getMessage(), ex.getCode());
        return Result.failure(ex.getCode(), ex.getMessage());
    }

    /**
     * @param ex
     * @return com.zpkj.ddw.vo.Result
     * @des 请求参数不全异常捕获
     * @author lic
     * @data 2019/11/13
     **/
    @ExceptionHandler({MissingServletRequestParameterException.class})
    public Result MissingServletRequestParameterException(MissingServletRequestParameterException ex) {
        logger.error("MissingServletRequestParameterException: {}({})", ex.getMessage(),ExceptionCode.EX_MISSINGSERVLETREQUESTPARAMETER.getCode());
        return Result.failure(ExceptionCode.EX_MISSINGSERVLETREQUESTPARAMETER.getCode(), ExceptionCode.EX_MISSINGSERVLETREQUESTPARAMETER.getException());
    }

    /**
     * @param ex
     * @return com.zpkj.ddw.vo.Result
     * @des 请求参数不全异常捕获
     * @author lic
     * @data 2019/11/13
     **/
    @ExceptionHandler({ConstraintViolationException.class})
    public Result ConstraintViolationException(ConstraintViolationException ex) {
        logger.error("MissingServletRequestParameterException: {}({})", ex.getMessage(),ExceptionCode.EX_MISSINGSERVLETREQUESTPARAMETER.getCode());
        return Result.failure(ExceptionCode.EX_MISSINGSERVLETREQUESTPARAMETER.getCode(), ExceptionCode.EX_MISSINGSERVLETREQUESTPARAMETER.getException());
    }

    /**
     * @param ex
     * @return com.zpkj.ddw.vo.Result
     * @des 系统异常捕获
     * @author lic
     * @data 2019/11/13
     **/
    @ExceptionHandler({Exception.class})
    public Result exception(Exception ex) {
        logger.error("Exception: ", ex);
        return Result.failure(ExceptionCode.EX_SYSTEM.getCode(), ExceptionCode.EX_SYSTEM.getException());
    }

}

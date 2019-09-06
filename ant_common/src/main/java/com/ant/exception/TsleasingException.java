package com.ant.exception;

/**
 * 顶级异常，所有的自定义异常继承此类。
 * 
 * @author gaigeshen
 * @since 04/18 2017
 */
public class TsleasingException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public TsleasingException(String message, Throwable cause) {
    super(message, cause);
  }

  public TsleasingException(String message) {
    super(message);
  }

  public TsleasingException(Throwable cause) {
    super(cause);
  }

  public TsleasingException() {
    super();
  }

  public TsleasingException(
      String message, Throwable cause,
      boolean enableSuppression, boolean writableStackTrace) {
    
    super(message, cause, enableSuppression, writableStackTrace);
  }

}

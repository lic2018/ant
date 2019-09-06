package com.ant.exception;

/**
 * 自定义异常，持有错误码。
 * 
 * @author gaigeshen
 * @since 04/18 2017
 */
public class CodeableException extends TsleasingException {

  private static final long serialVersionUID = 1L;

  /** The error code */
  private final ExceptionCode errorCode;
  
  /** The addition data */
  private Object data;
  
  /** The message arguments value */
  private Object[] args;

  /**
   * 创建异常
   * 
   * @param errorCode 错误码对象
   */
  public CodeableException(ExceptionCode errorCode) {
    super(errorCode.name());
    this.errorCode = errorCode;
  }
  
  /**
   * 创建异常
   * 
   * @param errorCode 错误码对象
   * @param data 附加的数据
   */
  public CodeableException(ExceptionCode errorCode, Object data) {
    super(errorCode.name());
    this.errorCode = errorCode;
		this.data = data;
	}
  
  /**
   * 创建异常
   * 
   * @param errorCode 错误码对象
   * @param args 模板参数值
   */
  public CodeableException(ExceptionCode errorCode, Object[] args) {
    super(errorCode.name());
    this.errorCode = errorCode;
    this.args = args;
  }


	/**
   * 创建异常
   * 
   * @param errorCode 错误码对象
   * @param cause 原始异常
   */
  public CodeableException(ExceptionCode errorCode, Throwable cause) {
    super(errorCode.name(), cause);
    this.errorCode = errorCode;
  }

  /**
   * 返回错误码对象
   * 
   * @return 错误码对象
   */
  public ExceptionCode code() { return this.errorCode; }
  
  /**
   * 返回附加的数据
   *
   * @return 附加的数据
   */
  public Object data() { return this.data; }
  
  /**
   * 返回模板参数值
   * 
   * @return 模板参数值
   */
  public Object[] args() { return this.args; }

}

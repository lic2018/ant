package com.ant.exception;

/**
 * 此类型异常将会定义指定的错误码
 * 
 * @author gaigeshen
 * @since 04/18 2017
 */
public class CodeException extends CodeableException {

  private static final long serialVersionUID = 1L;

  /**
   * 创建异常
   * 
   * @param errorCode 错误码对象
   */
  public CodeException(ExceptionCode errorCode) {
    super(errorCode);
  }

  /**
   * 创建异常
   * 
   * @param errorCode 错误码对象
   * @param data 附加的数据
   */
	public CodeException(ExceptionCode errorCode, Object data) {
		super(errorCode, data);
	}

	/**
	 * 创建异常
	 * 
	 * @param errorCode 错误码对象
	 * @param args 模板参数值
	 */
  public CodeException(ExceptionCode errorCode, Object[] args) {
    super(errorCode, args);
  }
  
}

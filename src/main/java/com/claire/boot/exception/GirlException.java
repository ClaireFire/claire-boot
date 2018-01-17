/**
 * @author Claire
 * @version 1.0.0
 * @filename GirlException.java
 * @time 2018年1月15日 下午6:09:00
 * @copyright(C) 2018 深圳市北辰德科技股份有限公司
 */
package com.claire.boot.exception;

import com.claire.boot.enums.ResultEnum;

/**
 *<Girl异常标准对象>
 *<自己定义的一个异常，必须继承RuntimeException才能进行事务回滚>
 * @see
 * @since
 */
public class GirlException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	
	private Integer code;

	public GirlException(ResultEnum resultEnum) {
		super(resultEnum.getMsg());
		this.code = resultEnum.getCode();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
	
}

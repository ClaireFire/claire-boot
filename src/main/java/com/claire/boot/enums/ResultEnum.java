/**
 * @author Claire
 * @version 1.0.0
 * @filename ResultEnum.java
 * @time 2018年1月16日 上午8:48:12
 * @copyright(C) 2018 深圳市北辰德科技股份有限公司
 */
package com.claire.boot.enums;
/**
 *<服务返回对象枚举>
 * @see
 * @since
 */
public enum ResultEnum {
	
	UNKNOWN(-1, "未知错误"),
	SUCCESS(0, "成功"),
	FAIL(1,"失败"),
	PRIMARY_SCHOOL(100, "你可能还在上小学"),
	MIDDLE_SCHOOL(101, "你可能还在上初中");
	
	private Integer code; 
	private String msg;
	
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	private ResultEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	
}

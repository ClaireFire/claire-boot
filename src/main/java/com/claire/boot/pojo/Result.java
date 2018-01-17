/**
 * @author Claire
 * @version 1.0.0
 * @filename Result.java
 * @time 2018年1月15日 下午5:28:48
 * @copyright(C) 2018 深圳市北辰德科技股份有限公司
 */
package com.claire.boot.pojo;
/**
 *<统一服务返回对象>
 * @param <T>
 * @see
 * @since
 */
public class Result<T> {

	private Integer code;
	private String msg;
	private T data;
	
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
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}

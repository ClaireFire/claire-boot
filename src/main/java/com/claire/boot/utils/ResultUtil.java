/**
 * @author Claire
 * @version 1.0.0
 * @filename ResultUtil.java
 * @time 2018年1月15日 下午5:36:01
 * @copyright(C) 2018 深圳市北辰德科技股份有限公司
 */
package com.claire.boot.utils;

import com.claire.boot.enums.ResultEnum;
import com.claire.boot.pojo.Result;

/**
 *<简述功能>
 *<功能详细描述>
 * @see
 * @since
 */
public class ResultUtil {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Result success(Object obj){
		Result result = new Result();
		result.setCode(ResultEnum.SUCCESS.getCode());
		result.setMsg(ResultEnum.SUCCESS.getMsg());
		result.setData(obj);
		return result;
	}
	
	@SuppressWarnings("rawtypes")
	public static Result success(){
		return success(null);
	}
	
	@SuppressWarnings("rawtypes")
	public static Result fail(Integer code, String msg){
		Result result = new Result();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}
}

/**
 * @author Claire
 * @version 1.0.0
 * @filename ExceptionHandle.java
 * @time 2018年1月15日 下午5:58:11
 * @copyright(C) 2018 深圳市北辰德科技股份有限公司
 */
package com.claire.boot.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.claire.boot.enums.ResultEnum;
import com.claire.boot.exception.GirlException;
import com.claire.boot.pojo.Result;
import com.claire.boot.utils.ResultUtil;

/**
 *<异常处理类>
 *<对自定义异常还有系统异常进行处理>
 * @see
 * @since
 */
@ControllerAdvice
public class ExceptionHandle {
	
	private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

	/**
	 * 异常处理帮助类
	 * @param e 异常对象
	 * @return Result对象
	 */
	@SuppressWarnings("rawtypes")
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Result handle(Exception e){
		//使我们自己定义的GirlException的话要返回自己的code和msg
		if(e instanceof GirlException){
			GirlException girlException = (GirlException) e;
			return ResultUtil.fail(girlException.getCode(), girlException.getMessage());
		}
		logger.error("【系统异常】{}", e);
		return ResultUtil.fail(ResultEnum.UNKNOWN.getCode(), ResultEnum.UNKNOWN.getMsg());
	}
	
}

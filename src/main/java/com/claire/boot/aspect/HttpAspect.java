/**
 * @author Claire
 * @version 1.0.0
 * @filename HttpAspect.java
 * @time 2018年1月15日 下午4:49:46
 * @copyright(C) 2018 深圳市北辰德科技股份有限公司
 */
package com.claire.boot.aspect;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 *<aop写日志>
 *<功能详细描述>
 * @see
 * @since
 */
@Aspect
@Component
public class HttpAspect {
	
	private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

	/*@Before("execution(public * com.claire.boot.controller.GrilController.*(..))")
	public void log(){
		System.out.println(111111111);
	}
	
	@After("execution(public * com.claire.boot.controller.GrilController.*(..))")
	public void doAfter(){
		System.out.println(2222222);
	}*/
	
	/**
	 * 确定切点
	 */
	@Pointcut("execution(public * com.claire.boot.controller.GrilController.*(..))")
	public void log(){
		
	}
	
	/**
	 * 记录http请求信息
	 * @param joinPoint
	 */
	@Before("log()")
	public void doBefore(JoinPoint joinPoint){
		ServletRequestAttributes attributes =  (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		//url
		logger.info("url={}", request.getRequestURL());
		//method
		logger.info("method={}", request.getMethod());
		//ip
		logger.info("ip={}", request.getRemoteAddr());
		//类方法
		logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName()+ "." + joinPoint.getSignature().getName());
		//参数
		logger.info("args={}", joinPoint.getArgs());
	}
	
	/**
	 * 记录服务器响应http请求开始
	 */
	@After("log()")
	public void doAfter(){
		logger.info("doAfter");
	}
	
	/**
	 * 记录服务器响应http返回的内容
	 * @param obj
	 */
	@AfterReturning(returning = "obj", pointcut = "log()")
	public void doAfterReturning(Object obj){
		logger.info("response={}", obj.toString());
	}
	
}

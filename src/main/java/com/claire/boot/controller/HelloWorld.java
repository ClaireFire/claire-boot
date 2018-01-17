/**
 * @author Claire
 * @version 1.0.0
 * @filename HelloWorld.java
 * @time 2018年1月15日 上午10:27:10
 * @copyright(C) 2018 深圳市北辰德科技股份有限公司
 */
package com.claire.boot.controller;

import java.lang.reflect.Method;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.claire.boot.properties.GirlProperties;

/**
 *<helloworld-boot>
 *<功能详细描述>
 * @see
 * @since
 */
@RestController
@RequestMapping("/hello/")
public class HelloWorld {

	@Value("${cupSize}")
	private String cupSize;
	
	@Resource
	private GirlProperties girlProperties;
	
	@RequestMapping(value = {"hello/{id}", "{id}/hi"}, method = RequestMethod.GET)
	public String say(@PathVariable("id") Integer id){
		//return girlProperties.getCupSize() + "; " + girlProperties.getAge().toString();
		return "id:" + id.toString();
	}
	
	@RequestMapping(value = {"tell", "t"}, method = RequestMethod.GET)
	public String tell(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id){
		//return girlProperties.getCupSize() + "; " + girlProperties.getAge().toString();
		return "id:" + id.toString();
	}
}

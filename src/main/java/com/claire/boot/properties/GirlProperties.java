/**
 * @author Claire
 * @version 1.0.0
 * @filename GirlProperties.java
 * @time 2018年1月15日 上午10:47:50
 * @copyright(C) 2018 深圳市北辰德科技股份有限公司
 */
package com.claire.boot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *<配置信息对应的对象>
 *<接受配置文件配置的信息>
 * @see
 * @since
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
	
	private String cupSize;
	private Integer age;
	
	
	public String getCupSize() {
		return cupSize;
	}
	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}

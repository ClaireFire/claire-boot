/**
 * @author Claire
 * @version 1.0.0
 * @filename Girl.java
 * @time 2018年1月15日 下午3:00:12
 * @copyright(C) 2018 深圳市北辰德科技股份有限公司
 */
package com.claire.boot.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

/**
 *<女孩实体类>
 * @see
 * @since
 */
@Entity
public class Gril {

	@Id
	@GeneratedValue
	private Integer id;
	@NotEmpty(message="胸围不能为空！")
	private String cupSize;
	@Min(value = 18, message="未成年少女禁止入内")
	private Integer age;
	
	/**
	 * 必须要有的，要不然数据库会报错
	 */
	public Gril() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Gril [id=" + id + ", cupSize=" + cupSize + ", age=" + age + "]";
	}
	
	
}

/**
 * @author Claire
 * @version 1.0.0
 * @filename GrilRepository.java
 * @time 2018年1月15日 下午3:23:24
 * @copyright(C) 2018 深圳市北辰德科技股份有限公司
 */
package com.claire.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claire.boot.pojo.Gril;

/**
 *<Gril Dao层>
 *<对数据库进行操作，里面有很多已有的方法，也可自己定义，但是要按照规定的格式>
 * @see
 * @since
 */
public interface GrilRepository extends JpaRepository<Gril, Integer> {

	/**
	 * 通过年龄查询，注意不能乱写要按这个格式来写
	 * @param age
	 * @return
	 */
	public List<Gril> findByAge(Integer age);
}

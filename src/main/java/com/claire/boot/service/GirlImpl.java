/**
 * @author Claire
 * @version 1.0.0
 * @filename GirlImpl.java
 * @time 2018年1月15日 下午4:13:21
 * @copyright(C) 2018 深圳市北辰德科技股份有限公司
 */
package com.claire.boot.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claire.boot.enums.ResultEnum;
import com.claire.boot.exception.GirlException;
import com.claire.boot.pojo.Gril;
import com.claire.boot.repository.GrilRepository;

/**
 *<Gril Service层实现类>
 *<进行业务逻辑处理>
 * @see
 * @since
 */
@Service
public class GirlImpl implements IGirlService {
	
	@Autowired
	private GrilRepository grilRepository;

	@Transactional
	public void insertTwo(){
		Gril g1 = new Gril();
		g1.setAge(18);
		g1.setCupSize("C");
		grilRepository.save(g1);
		
		Gril g2 = new Gril();
		g2.setAge(17);
		g2.setCupSize("B");
		grilRepository.save(g2);
	}
	
	public Gril getAge(Integer id) throws Exception{
		Gril gril = grilRepository.findOne(id);
		Integer age = gril.getAge();
		if(age < 10){
			throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
			//ExceptionHandle.handle("你还在上小学吧");
		}else if(age>10 && age <16){
			throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
		}
		return gril;
	}
	
	public Gril findOne(Integer id){
		return grilRepository.findOne(id);
	}
}

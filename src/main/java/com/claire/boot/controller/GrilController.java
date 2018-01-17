/**
 * @author Claire
 * @version 1.0.0
 * @filename GrilController.java
 * @time 2018年1月15日 下午3:20:55
 * @copyright(C) 2018 深圳市北辰德科技股份有限公司
 */
package com.claire.boot.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.claire.boot.enums.ResultEnum;
import com.claire.boot.pojo.Gril;
import com.claire.boot.pojo.Result;
import com.claire.boot.repository.GrilRepository;
import com.claire.boot.service.IGirlService;
import com.claire.boot.utils.ResultUtil;

/**
 *<Girlcontroller>
 *<数据库的增、删、改、查、事务回滚、异常处理、表单验证>
 * @see
 * @since
 */
@RestController()
@RequestMapping("/girls/")
public class GrilController {
	
	private final static Logger logger = LoggerFactory.getLogger(GrilController.class);

	@Autowired
	private GrilRepository grilRepository;
	@Autowired
	private IGirlService girlImpl;
	
	@GetMapping("/query")
	public List<Gril> girlList() throws Exception{
		return grilRepository.findAll();
	}
	
	@PostMapping("queryById")
	public Gril queryGirlById(@RequestParam("id") Integer id){
		return grilRepository.findOne(id);
	}
	
	@PostMapping("queryByAge")
	public List<Gril> queryGirlByAge(@RequestParam("age") Integer age){
		return grilRepository.findByAge(age);
	}
	
	/*@PostMapping("add")
	public Gril girlAdd(@RequestParam("cupSize") String cupSize,
						@RequestParam("age") Integer age){
		Gril g = new Gril();
		g.setAge(age);
		g.setCupSize(cupSize);
		return grilRepository.save(g);
	}*/
	
	@SuppressWarnings("unchecked")
	@PostMapping("add")
	public Result<Gril> girlAdd(@Valid Gril gril, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return ResultUtil.fail(ResultEnum.FAIL.getCode(), bindingResult.getFieldError().getDefaultMessage());
		}
		gril.setAge(gril.getAge());
		gril.setCupSize(gril.getCupSize());
		return ResultUtil.success(grilRepository.save(gril));
	}
	
	@PostMapping("addTwo")
	public void girlAdd(){
		girlImpl.insertTwo();
	}
	
	@PostMapping("deleteById")
	public void deleteGirlById(@RequestParam("id") Integer id){
		grilRepository.delete(id);
	}
	
	@PostMapping("updateById")
	public Gril updateGirlById(@RequestParam("id") Integer id, 
							   @RequestParam("cupSize") String cupSize,
							   @RequestParam("age") Integer age){
		Gril g = new Gril();
		g.setId(id);
		g.setAge(age);
		g.setCupSize(cupSize);
		return grilRepository.saveAndFlush(g);
	}
	
	@RequestMapping(value = "getAge/{id}")
	public Gril getAge(@PathVariable("id") Integer id) throws Exception{
		return girlImpl.getAge(id);
	}
}

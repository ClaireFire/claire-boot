/**
 * @author Claire
 * @version 1.0.0
 * @filename IGirlService.java
 * @time 2018年1月16日 上午9:48:36
 * @copyright(C) 2018 深圳市北辰德科技股份有限公司
 */
package com.claire.boot.service;


import com.claire.boot.pojo.Gril;

/**
 *<简述功能>
 *<功能详细描述>
 * @see
 * @since
 */
public interface IGirlService {

	/**
	 * 测试事务回滚，同时插入两条数据，要么同时成功，要么同时失败
	 */
	public void insertTwo();

	/**
	 * 通过id查询女孩
	 * 测试自定义异常
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Gril getAge(Integer id) throws Exception;

	/**
	 * 通过一个id查询一个女孩
	 * @param id id值
	 * @return 返回一个女孩对象
	 */
	public Gril findOne(Integer id);

}
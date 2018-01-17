/**
 * @author Claire
 * @version 1.0.0
 * @filename GirlImplTest.java
 * @time 2018年1月16日 上午9:52:34
 * @copyright(C) 2018 深圳市北辰德科技股份有限公司
 */
package com.claire.boot.service;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.claire.boot.pojo.Gril;
import com.claire.boot.service.GirlImpl;

/**
 *<简述功能>
 *<功能详细描述>
 * @see
 * @since
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlImplTest {
	
	@Autowired
	private GirlImpl girlImpl;

	/*@Test
	public void testInsertTwo() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAge() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testFindOne() {
		Gril girl = girlImpl.findOne(1);
		Assert.assertEquals(new Integer(1), girl.getAge());
	}

}

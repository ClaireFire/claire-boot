/**
 * @author Claire
 * @version 1.0.0
 * @filename GrilControllerTest.java
 * @time 2018年1月16日 上午9:59:41
 * @copyright(C) 2018 深圳市北辰德科技股份有限公司
 */
package com.claire.boot.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 *<简述功能>
 *<功能详细描述>
 * @see
 * @since
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GrilControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testGirlList() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.put("/girls/query"))
					.andExpect(MockMvcResultMatchers.status().isOk());
					//.andExpect(MockMvcResultMatchers.content().string("abc"));
	}

	/*@Test
	public void testQueryGirlById() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryGirlByAge() {
		fail("Not yet implemented");
	}

	@Test
	public void testGirlAddGrilBindingResult() {
		fail("Not yet implemented");
	}

	@Test
	public void testGirlAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteGirlById() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateGirlById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAge() {
		fail("Not yet implemented");
	}*/

}

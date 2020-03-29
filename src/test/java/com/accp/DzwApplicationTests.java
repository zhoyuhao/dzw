package com.accp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.zyh.ceshibiz;

@SpringBootTest
class DzwApplicationTests {

	/***环境测试成功
	 * 
	 */
	
	@Autowired 
	
	private ceshibiz biz;

	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void ceshi() {
		System.out.println(biz.ceshi());
	}
}

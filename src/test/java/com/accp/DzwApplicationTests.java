package com.accp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.lc.lcGoodsBiz;
import com.accp.biz.zyh.ceshibiz;

@SpringBootTest
class DzwApplicationTests {

	/***环境测试成功
	 * 
	 */
	
	@Autowired
	private lcGoodsBiz biz;
	
	
	

	@Test
	void contextLoads() {
		biz.querybyid(123);
	}
	
	
	
}

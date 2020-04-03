package com.accp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.cqq.CqqServiceBiz;
import com.accp.biz.cqq.CqqSupplierBiz;
import com.accp.biz.zyh.ceshibiz;

@SpringBootTest
class DzwApplicationTests {

	/***环境测试成功
	 * 
	 */
	
	@Autowired 
	
	private ceshibiz biz;
	
	@Autowired 
	
	private CqqServiceBiz cqqServiceBiz;

	@Autowired 
	private CqqSupplierBiz cqqSupplierBiz;
	
	@Test
	void contextLoads() {
		System.out.println(cqqSupplierBiz.selectSupplierList(1, 1));
	}
	
	
	@Test
	public void ceshi() {
		//cqqServiceBiz.sss();
	}
}

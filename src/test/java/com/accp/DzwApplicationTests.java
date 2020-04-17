package com.accp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.cqq.CqqServiceBiz;
import com.accp.biz.lc.lcserviceBiz;


@SpringBootTest
class DzwApplicationTests {

	/***
	 * 环境测试成功
	 * 
	 */
	/*
	 * @Autowired private lcserviceBiz biz;
	 * 
	 * @Autowired private CqqServiceBiz cqqServiceBiz;
	 */

	@Test
	public void ceshi() {
		int j=0;
		for (int i = 0; i < 10; i++) {
			j=(j++);
			System.out.println("j="+j);
		}
		System.out.println(j);
	}

}

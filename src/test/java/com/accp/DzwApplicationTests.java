package com.accp;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.lc.lcGoodsBiz;
import com.accp.biz.lc.lcPersonnelBiz;
import com.accp.biz.lc.lcengineBiz;
import com.accp.biz.lc.lcserviceBiz;
import com.accp.biz.lc.lcworkergroupBiz;
import com.accp.vo.lc.lcpersonnelVo;
import com.accp.vo.lc.lcserviceVo;



@SpringBootTest
class DzwApplicationTests {

	/***环境测试成功
	 * 
	 */
	@Autowired
	private lcPersonnelBiz biz;

	
	

	@Test
	public void ceshi() {
		//cqqServiceBiz.sss();
		/*
		 * biz.saveaa(new lcpersonnelVo("666", null, "小明", "男", "22", new Date(), "1",
		 * "1", "1", null, "1", 1, 1, "1", 1, "1"));
		 */
		
	}

}

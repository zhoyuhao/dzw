package com.accp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

<<<<<<< HEAD
import com.accp.biz.cqq.CqqServiceBiz;
=======
import com.accp.biz.lc.lcGoodsBiz;
import com.accp.biz.lc.lcPersonnelBiz;
import com.accp.biz.lc.lcengineBiz;
>>>>>>> branch 'master' of https://github.com/zhoyuhao/dzw.git
import com.accp.biz.lc.lcserviceBiz;
<<<<<<< HEAD
=======
import com.accp.biz.lc.lcworkergroupBiz;
import com.accp.vo.lc.lcpersonnelVo;
import com.accp.vo.lc.lcserviceVo;

>>>>>>> branch 'master' of https://github.com/zhoyuhao/dzw.git


@SpringBootTest
class DzwApplicationTests {

	/***
	 * 环境测试成功
	 * 
	 */
<<<<<<< HEAD
	/*
	 * @Autowired private lcserviceBiz biz;
	 * 
	 * @Autowired private CqqServiceBiz cqqServiceBiz;
	 */
=======
	@Autowired
	private lcPersonnelBiz biz;

	
	
>>>>>>> branch 'master' of https://github.com/zhoyuhao/dzw.git

	@Test
	public void ceshi() {
<<<<<<< HEAD
		int j=0;
		for (int i = 0; i < 10; i++) {
			j=(j++);
			System.out.println("j="+j);
		}
		System.out.println(j);
=======
		//cqqServiceBiz.sss();
		/*
		 * biz.saveaa(new lcpersonnelVo("666", null, "小明", "男", "22", new Date(), "1",
		 * "1", "1", null, "1", 1, 1, "1", 1, "1"));
		 */
		
>>>>>>> branch 'master' of https://github.com/zhoyuhao/dzw.git
	}

}

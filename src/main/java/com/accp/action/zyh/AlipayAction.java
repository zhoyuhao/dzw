package com.accp.action.zyh;

import java.io.File;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alipay.demo.trade.service.Main;

@RestController
@RequestMapping("AlipayAction/api")
public class AlipayAction {


	/**根据单号做唯一生成，单号二维码
	 * 
	 * @param numbersId
	 * @return
	 */
	@GetMapping("getImg/{numbersId}/{money}")
	public String getCodeImg(@PathVariable String numbersId,@PathVariable Float money) {
		 return  new Main().test_trade_precreate(numbersId,money);
	}
	
	/**根据单号查看此单号支付状态
	 * 
	 * @param numbersId
	 * @return
	 */
	@GetMapping("queryStatuc/{numbersId}")
	public String queryStatuc(@PathVariable String numbersId) {
		 return  new Main().test_trade_query(numbersId);
	}
	
	@DeleteMapping("delete")
	public  void delete(String url) {
		File file=new File("D:\\y2imgs\\qr-"+url);
		file.delete();
	}
}

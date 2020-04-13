package com.accp.action.zyh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zyh.shoyeBiz;
import com.accp.vo.zyh.shoye_vo;

@RestController
@RequestMapping("shoyeAction/api")
public class shoyeAction {
	
	@Autowired
	private shoyeBiz biz;
	///首页action

	/**今日接单数量（内、外）
	 * 
	 * @return
	 */
	@GetMapping("queryJieDan")
	public shoye_vo queryJieDan() {
		return biz.queryJieDan();
	}
	
	/**今日结算数量
	 * 
	 * @return
	 */
	@GetMapping("queryJieSuan")
	public Integer queryJieSuan() {
		return biz.queryJieSuan();
	}
	
	/**查看今日客户添加的数量
	 * 
	 * @return
	 */
	@GetMapping("queryKeHu")
	public shoye_vo queryKeHu() {
		return biz.queryKeHu();
	}
	
	/**今日收入
	 * 
	 * @return
	 */
	@GetMapping("queryMoney")
	public shoye_vo queryMoney() {
		return biz.queryMoney();
	}

	/**查看一周的收入
	 * 
	 * @return
	 */
	@GetMapping("queryZQMoney")
	public List<shoye_vo> queryZQMoney(){
		return biz.queryZQMoney();
	}
	
	/**查看上周的收入
	 * 
	 * @return
	 */
	@GetMapping("queryZQMoneyS")
	public List<shoye_vo> queryZQMoneyS(){
		return biz.queryZQMoneyS();
	}
}

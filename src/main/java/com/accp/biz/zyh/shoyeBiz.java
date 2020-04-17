package com.accp.biz.zyh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zyh.shoyeMapper;
import com.accp.dao.zyh.zyhCustomerMapper;
import com.accp.vo.zyh.shoye_vo;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class shoyeBiz {
	@Autowired
	private shoyeMapper dao;
	

	/**今日接单数量（内、外）
	 * 
	 * @return
	 */
	public shoye_vo queryJieDan() {
		return dao.queryJieDan();
	}
	
	/**今日结算数量
	 * 
	 * @return
	 */
	public Integer queryJieSuan() {
		return dao.queryJieSuan();
	}
	
	/**查看今日客户添加的数量
	 * 
	 * @return
	 */
	public shoye_vo queryKeHu() {
		return dao.queryKeHu();
	}
	
	/**今日收入
	 * 
	 * @return
	 */
	public shoye_vo queryMoney() {
		return dao.queryMoney();
	}

	/**查看一周的收入
	 * 
	 * @return
	 */
	public List<shoye_vo> queryZQMoney(){
		return dao.queryZQMoney();
	}
	/**查看上周的收入
	 * 
	 * @return
	 */
	public List<shoye_vo> queryZQMoneyS(){
		return dao.queryZQMoneyS();
	}
	
}

package com.accp.dao.zyh;

import java.util.List;

import com.accp.vo.zyh.shoye_vo;

public interface shoyeMapper {
	
	/**今日接单数量（内、外）
	 * 
	 * @return
	 */
	shoye_vo queryJieDan();
	
	/**今日结算数量
	 * 
	 * @return
	 */
	Integer queryJieSuan();
	
	/**查看今日客户添加的数量
	 * 
	 * @return
	 */
	shoye_vo queryKeHu();
	
	/**今日收入
	 * 
	 * @return
	 */
	shoye_vo queryMoney();
	
	/**查看一周的收入
	 * 
	 * @return
	 */
	List<shoye_vo> queryZQMoney();
	
	/**查看上周的收入
	 * 
	 * @return
	 */
	List<shoye_vo> queryZQMoneyS();
	
 }

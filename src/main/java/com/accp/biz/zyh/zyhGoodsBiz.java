package com.accp.biz.zyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zyh.zyhGoodsMapper;
import com.accp.pojo.Goods;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class zyhGoodsBiz {
	
	@Autowired
	private zyhGoodsMapper dao;
	
	/**查看有几种车型的商品
	 * 
	 * @return
	 */
	public List<Goods> queryByCarType(){
		return dao.queryByCarType();
	}
	
	
}

package com.accp.dao.zyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Goods;

public interface zyhGoodsMapper {
    
	/**查看有几种车型的商品
	 * 
	 * @return
	 */
	List<Goods> queryByCarType();
	
	/***根据车类型分类商品
	 * 
	 * @param carname
	 * @return
	 */
	List<Goods> queryByCarTypeName(@Param("carname")String carname);
}
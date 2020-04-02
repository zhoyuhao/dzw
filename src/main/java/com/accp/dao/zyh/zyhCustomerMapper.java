package com.accp.dao.zyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.*;
import com.accp.vo.zyh.*;

public interface zyhCustomerMapper {
    
	/**查看所有客户 或 名称查看
	 * 
	 * @param name
	 * @return
	 */
	List<zyhCustomer_vo> queryAllOrByName(@Param("name")String name);
	
	/***给用户添加车辆
	 * 
	 * @param p
	 * @return
	 */
	int carAdd(@Param("p")List<zyhCustomerCar_vo> p );
	
	/**客户和车辆添加
	 * 
	 * @param p
	 * @return
	 */
	int khuAndCar(@Param("p")zyhCustomer_vo p );
	
	/**根据客户id删除 此客户所有车辆
	 * 
	 * @param id
	 * @return
	 */
	int deleteCar(@Param("id")String id);
}
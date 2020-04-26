package com.accp.biz.zyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zyh.zyhCustomerMapper;
import com.accp.vo.zyh.zyhCustomerCar_vo;
import com.accp.vo.zyh.zyhCustomer_vo;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class zyhCustomerBiz {
	
	@Autowired
	private zyhCustomerMapper dao;
	
	/**查看所有客户 或 名称查看
	 * 
	 * @param name
	 * @return
	 */
	public List<zyhCustomer_vo> queryAllOrByName(String name){
		return dao.queryAllOrByName(name);
	}
	
	public List<zyhCustomer_vo> queryAllOrByName2(String name){
		return dao.queryAllOrByName2(name);
	}
	/***给用户添加车辆
	 * 
	 * @param p
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int carAdd(List<zyhCustomerCar_vo> p ) {
		return dao.carAdd(p);
	}
	
	/**客户和车辆添加
	 * 
	 * @param p
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int khuAndCar(zyhCustomer_vo p ) {
		return dao.khuAndCar(p);
	}
	
	/**根据客户id删除 此客户所有车辆
	 * 
	 * @param id
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int deleteCar(String id) {
		try {
			return dao.deleteCar(id);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	

	/***根据车辆id批量删除
	 * 
	 * @param list
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int deleteByCarId(List<Integer> list) {
		return dao.deleteByCarId(list);
	}
}

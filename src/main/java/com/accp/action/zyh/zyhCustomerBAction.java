package com.accp.action.zyh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zyh.zyhCustomerBiz;
import com.accp.vo.zyh.zyhCustomerCar_vo;
import com.accp.vo.zyh.zyhCustomer_vo;

@RestController
@RequestMapping("zyhCustomerBAction/api")
public class zyhCustomerBAction {

	@Autowired
	private zyhCustomerBiz biz;
	
	/**查看所有客户 或 名称查看
	 * 
	 * @param name
	 * @return
	 */
	@GetMapping("queryAllOrByName/{name}")
	public List<zyhCustomer_vo> queryAllOrByName(@PathVariable String name){
		name="null".equals(name)?"":name;
		return biz.queryAllOrByName(name);
	}
	
	/***给用户添加车辆
	 * 
	 * @param p
	 * @return
	 */
	@PostMapping("carAdd")
	public int carAdd(@RequestBody List<zyhCustomerCar_vo> p ) {
		return biz.carAdd(p);
	}
	
	/**客户和车辆添加
	 * 
	 * @param p
	 * @return
	 */
	@PostMapping("khuAndCar")
	public int khuAndCar(@RequestBody zyhCustomer_vo p ) {
		return biz.khuAndCar(p);
	}
	
	/**根据客户id删除 此客户所有车辆
	 * 
	 * @param id
	 * @return
	 */
	@PostMapping("deleteCar")
	public int deleteCar(@RequestBody zyhCustomer_vo p ) {
		if(biz.deleteCar(p.getCidk())!=0) {
			return this.khuAndCar(p);
		}
		return 0;
	}

	/***根据车辆id批量删除
	 * 
	 * @param list
	 * @return
	 */
	@DeleteMapping("deleteByCarId")
	public int deleteByCarId(@RequestBody List<Integer> list) {
		System.out.println(list.size());
		return biz.deleteByCarId(list);
	}
}

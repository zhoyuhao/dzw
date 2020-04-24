package com.accp.action.ljn;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljn.ljnCustomercarBiz;
import com.accp.pojo.Customercar;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("ljn/api/ljnCustomercarAction")
public class ljnCustomercarAction {

	@Resource ljnCustomercarBiz biz;
	//查询车辆信息
	@GetMapping("query/{pageNum}/{carlicenceplate}")
	public PageInfo<Customercar> query(@PathVariable int pageNum,@PathVariable String carlicenceplate) {
		if(carlicenceplate.equals("null")) {
			carlicenceplate="";
		}
		return biz.query(pageNum, carlicenceplate);
	}
	//删除车辆信息
	@GetMapping("remove/{carid}")
	public int remove(@PathVariable int carid) {
		return biz.remove(carid);
	}
	//新增车辆信息
	@PostMapping("add")
	public int add(@RequestBody Customercar entity) {
		return biz.add(entity);
	}
	//查询指定车辆信息
	@GetMapping("queryid/{carid}")
	public Customercar queryid(@PathVariable int carid) {
		return biz.queryid(carid);
	}
	//修改车辆信息
	@PostMapping("update")
	public int update(@RequestBody Customercar entity) {
		return biz.update(entity);
	}
}

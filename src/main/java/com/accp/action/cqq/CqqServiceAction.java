package com.accp.action.cqq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.cqq.CqqServiceBiz;
import com.accp.pojo.Personnel;
import com.accp.pojo.Service;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("CqqServiceAction/api")
public class CqqServiceAction {
	//
	@Autowired
	private CqqServiceBiz cqqServiceBiz;

	@GetMapping("{n}/{s}/{wid}/{name}")
	public PageInfo<Service> selectServiceList(@PathVariable Integer n, @PathVariable Integer s,
			@PathVariable Integer wid, @PathVariable String name) {
		System.out.println("进入结算中心");
		return cqqServiceBiz.selectServiceList(n, s, wid, name);
	}

	@PostMapping("update")
	public int updateService(@RequestBody Service service) {
		return cqqServiceBiz.updateService(service);
	}
}

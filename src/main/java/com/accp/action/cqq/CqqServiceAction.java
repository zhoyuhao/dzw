package com.accp.action.cqq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.cqq.CqqServiceBiz;
import com.accp.pojo.Service;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("CqqServiceAction/api")
public class CqqServiceAction {

	@Autowired
	private CqqServiceBiz cqqServiceBiz;

	@GetMapping("{n}/{s}")
	public PageInfo<Service> selectServiceList(@PathVariable Integer n, @PathVariable Integer s) {
		System.out.println("进入结算中心");
		return cqqServiceBiz.selectServiceList(n, s);
	}
}

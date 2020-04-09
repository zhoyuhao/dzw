package com.accp.action.ljn;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljn.ljnServiceBiz;
import com.accp.pojo.Service;

@RestController
@RequestMapping("ljn/api/ljnServiceAction")
public class ljnServiceAction {

	@Resource ljnServiceBiz biz;
	//查询需要接车信息
	@GetMapping("query")
	public List<Service> query() {
		return biz.query();
	}
	
}

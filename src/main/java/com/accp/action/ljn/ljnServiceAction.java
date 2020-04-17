package com.accp.action.ljn;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	//更改维修状态
	@GetMapping("update/{wstatic}/{wid}")
	public int update(@PathVariable int wstatic,@PathVariable int wid) {
		return biz.update(wstatic,wid);
	}
}

package com.accp.action.ljn;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljn.ljnPersonnelBiz;
import com.accp.biz.ljn.ljnServiceBiz;
import com.accp.pojo.Personnel;

@RestController
@RequestMapping("ljn/api/ljnPersonnelAction")
public class ljnPersonnelAction {

	//查询员工编号
	@Resource ljnPersonnelBiz biz;
	@GetMapping("query")
	public List<Personnel> query() {
		return biz.query();
	}
	@GetMapping("queryid/{pname}")
	public Personnel queryid(@PathVariable String pname) {
		return biz.queryid(pname);
	}
}

package com.accp.action.lc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lc.lcPostBiz;
import com.accp.biz.lc.lcworkergroupBiz;
import com.accp.vo.lc.lcpostVo;
import com.accp.vo.lc.lcworkergroupVo;

@RestController
@RequestMapping("lc/api/workergroups")
public class lcworkergroupAction {
	
	@Autowired
	private lcworkergroupBiz bizs;
	
	@Autowired
	private lcPostBiz biz;

	//已有的技工
	@GetMapping("")
	public List<lcworkergroupVo> queryall() {
		return bizs.querall();
	}
	
	//已有的职位
	@GetMapping("zw")
	public List<lcpostVo> queryallzw(){
		return biz.queryall();
	}


}

package com.accp.action.lc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lc.lcRoleBiz;
import com.accp.vo.lc.lcrolevo;

@RestController
@RequestMapping("/lc/api/lcRoles")
public class lcRoleAction {
	@Autowired
	private lcRoleBiz bizs;
	
	//查询所有角色
	@GetMapping("/ssb")
	public List<lcrolevo> queryall(){
		return bizs.queryall();
	}
}

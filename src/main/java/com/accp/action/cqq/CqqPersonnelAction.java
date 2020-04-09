package com.accp.action.cqq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.accp.biz.cqq.CqqPersonnelBiz;
import com.accp.pojo.Personnel;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("CqqPersonnelAction/api")
public class CqqPersonnelAction {
	@Autowired
	private CqqPersonnelBiz cqqPersonnelBiz;
	//
	@GetMapping("{n}/{s}/{pstatic}/{name}")
	public PageInfo<Personnel> selectCustomerList(@PathVariable Integer n, @PathVariable Integer s,
			@PathVariable Integer pstatic, @PathVariable String name) {
		System.out.println("离职管理");
		return cqqPersonnelBiz.selectCustomerList(n, s, pstatic, name);
	}

	@PostMapping("update")
	public int personnelUpdate(@RequestBody Personnel personnel) {
		return cqqPersonnelBiz.personnelUpdate(personnel);
	}

	@DeleteMapping("{id}")
	public int personnelDelete(@PathVariable Integer id) {
		return cqqPersonnelBiz.personnelDelete(id);
	}
}

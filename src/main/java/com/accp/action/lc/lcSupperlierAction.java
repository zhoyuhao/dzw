package com.accp.action.lc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lc.lcSupplierBiz;
import com.accp.vo.lc.lcSupplierVo;

@RestController
@RequestMapping("/lc/api/lcSupperliers")
public class lcSupperlierAction {

	@Autowired
	private lcSupplierBiz lcBiz;
	
	@GetMapping("")
	public List<lcSupplierVo> lcqueryall(){
		return lcBiz.queryall();
	}
}

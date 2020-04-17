package com.accp.action.lc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lc.lcengineBiz;
import com.accp.vo.lc.lcengineVo;

@RestController
@RequestMapping("/lc/api/engine")
public class lcengineAction {
	
	@Autowired
	private lcengineBiz biz;
	
	@GetMapping("/sss")
	public List<lcengineVo> queryall(){
		return biz.queryall();
	}

}

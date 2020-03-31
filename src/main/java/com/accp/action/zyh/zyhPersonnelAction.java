package com.accp.action.zyh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zyh.zyhPersonnelBiz;
import com.accp.dao.zyh.*;
import com.accp.vo.zyh.zyhpersonnel_vo;

@RestController
@RequestMapping("zyhPersonnelAction/api")
public class zyhPersonnelAction {
		
	@Autowired
	private zyhPersonnelBiz pBiz;
	
	/***登入
	 * 
	 * @param name
	 * @param pwd
	 * @return
	 */
	@GetMapping("querylogin/{name}/{pwd}")
	public zyhpersonnel_vo querylogin(@PathVariable String name,@PathVariable String pwd) {
		return pBiz.querylogin(name, pwd);
	}
}

package com.accp.biz.zyh;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zyh.zyhPersonnelMapper;
import com.accp.vo.zyh.zyhpersonnel_vo;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class zyhPersonnelBiz {
	
	@Autowired
	private zyhPersonnelMapper dao;
	
	/***登入
	 * 
	 * @param name
	 * @param pwd
	 * @return
	 */
	public zyhpersonnel_vo querylogin(String name,String pwd) {
		return dao.querylogin(name, pwd)==null?new zyhpersonnel_vo():dao.querylogin(name, pwd);
	}
	
}

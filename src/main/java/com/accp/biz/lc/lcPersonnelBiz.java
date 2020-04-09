package com.accp.biz.lc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lc.lcPersonnelMapper;
import com.accp.vo.lc.lcpersonnelVo;
import com.accp.vo.lc.lcpersonnelsVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class lcPersonnelBiz {
	
	@Autowired
	private lcPersonnelMapper dao;
	
	///查询所有员工
	
	public PageInfo<lcpersonnelVo> queryall(Integer n,Integer s,String pname){
		PageHelper.startPage(n, s);
		return new PageInfo<lcpersonnelVo>(dao.queryalOrName(pname));
	}
	
	//根据编号删除员工在删除员工角色mm
	public int removeyg(String pid) {
		return dao.romoveyg(pid);
	}
	
	public lcpersonnelVo queryByid(String pid) {
		return dao.queryByid(pid);
	}
	//修改
	@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int modeilid(lcpersonnelsVo lcss) {
		return dao.updateById(lcss);
	}
	
	//增加
		@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = false)
		public int saveaa(lcpersonnelsVo lcss) {
			return dao.insert(lcss);
		}
	

}

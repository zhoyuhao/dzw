package com.accp.biz.lc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lc.lcSupplierMapper;
import com.accp.vo.lc.lcSupplierVo;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class lcSupplierBiz {
	
	@Autowired
	private lcSupplierMapper dao;
	
	//查询所有供应商编号做新增
	public List<lcSupplierVo> queryall(){
		return dao.selectList(null);
	}

}

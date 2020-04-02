package com.accp.biz.zyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zyh.*;
import com.accp.pojo.*;
import com.accp.vo.zyh.*;


@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class zyhRoleBiz {

	@Autowired
	private zyhRoleMapper dao;

	/**查看所有 角色 的权限和 用角色的用户
	 * 
	 * @return
	 */
	public List<zyhRole_vo> queryAll(){
		return dao.queryAll();
	}
	
	/**查看所有权限
	 * @return
	 */
	public List<zyhFunction_vo> qxAll(){
		return dao.qxAll();
				
	}
	

	/**根据角色id删除这个角色所有权限
	 * 
	 * @param id
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int deteteByName(Integer id) {
		return dao.deteteByName(id);
	}
	
	/**给指点的角色添加权限
	 * 
	 * @param list
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int roleAdd(List<zyhRoleandfunction_vo> list) {
		return dao.roleAdd(list);
	}
}

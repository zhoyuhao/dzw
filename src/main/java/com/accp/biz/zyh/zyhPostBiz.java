package com.accp.biz.zyh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zyh.*;
import com.accp.pojo.Post;
import com.accp.pojo.Role;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class zyhPostBiz {
	
	@Autowired
	private zyhPostMapper dao;
	
	@Autowired
	private zyhRoleMapper rDao;
	/**岗位添加
	 * 
	 * @param entity
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int insert(Post entity) {
		return dao.insert(entity);
	}
	
	/**崗位查看
	 * 
	 * @param id
	 * @param name
	 * @return
	 */
	public List<Post> postQueryAll(Integer id ,String name){
		QueryWrapper<Post> qw=Wrappers.query();
		qw.notIn("gwname", "系统");
		if(id!=0) {
			qw.eq("pid", id);
		}
		if(name!=null) {
			qw.eq("gwname", name);
		}
		return dao.selectList(qw);
		
	}
	/**根据id删除岗位
	 * 
	 * @param id
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int deleteById(Integer id) {
		if(dao.selectPersonnel(id)!=0) {
			return -1;
		}
		return dao.deleteById(id);
	}
	
	/**角色添加
	 * 
	 * @param entity
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int roleAdd(Role entity) {
		return rDao.insert(entity);
	}
	
	/**角色删除
	 * 
	 * @param id
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int deleteRole(Integer id) {
		if(dao.selectUersandrole(id)!=0) {
			return -1;
		}
		return rDao.deleteById(id);
	}
	
	/**查看所有角色
	 * 
	 * @param id
	 * @param name
	 * @return
	 */
	public List<Role> roleQueryAll(Integer id ,String name){
		QueryWrapper<Role> qw=Wrappers.query();
		qw.notIn("cname", "系统");
		if(id!=0) {
			qw.eq("cid", id);
		}
		if(name!=null) {
			qw.eq("cname", name);
		}
		return rDao.selectList(qw);
	}
}

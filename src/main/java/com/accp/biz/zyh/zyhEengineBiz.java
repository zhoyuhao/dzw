package com.accp.biz.zyh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zyh.zyhEengineMapper;
import com.accp.pojo.Eengine;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class zyhEengineBiz {
	
	@Autowired
	private zyhEengineMapper dao;
	
	/**查看所有 或者 模糊查看
	 * 
	 * @param name
	 * @return
	 */
	public List<Eengine> queryAll(String name){
		QueryWrapper<Eengine> qw=Wrappers.query();
		qw.like("ename", name);
		return dao.selectList(qw);
	}
	
	/**根据id删除
	 * 
	 * @param id
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int delete(Integer id) {
		return dao.deleteById(id);
	}
	
	/**添加发动机
	 * 
	 * @param entity
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int eengineAdd(Eengine entity) {
		return dao.insert(entity);
	}
}

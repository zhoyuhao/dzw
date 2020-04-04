package com.accp.biz.yld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yld.artisanGroupDao;
import com.accp.pojo.Workergroup;
import com.accp.vo.yld.artisanGroupVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
public class artisanGroupBiz {

    @Autowired
    private artisanGroupDao dao;
    
    /**
     * 查询所有的技工班组并分页
     * @param c
     * @param s
     * @return
     */
    public PageInfo<artisanGroupVo> queryAll(int c, int s){
	PageHelper.startPage(c,s);
	return new PageInfo<artisanGroupVo>(dao.queryAll());
    }
    
    /**
     * 新增技工班组
     * @param entity
     * @return
     */
    public int insertAgroup(Workergroup entity) {
	return dao.insert(entity);
    }
    
    /**
     * 修改技工班组
     * @param entity
     * @return
     */
    public int modifyAgroup(Workergroup entity) {
	return dao.updateById(entity);
    }
    
    /**
     * 移除技工班组
     * @param id
     * @return
     */
    public int removeAgroup(String id) {
	return dao.deleteById(id);
    }
}

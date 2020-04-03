package com.accp.biz.yld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yld.artisanDao;
import com.accp.pojo.Personnel;
import com.accp.vo.yld.artisanVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
public class artisanBiz {

    @Autowired
    private artisanDao dao;
    
    /**
     * 查询所有员工信息并分页
     * @param c	当前页
     * @param s	数据量
     * @return
     */
    public PageInfo<artisanVo> queryAll(int c, int s){
	PageHelper.startPage(c,s);
	return new PageInfo<artisanVo>(dao.queryAll());
    }
    
    /**
     * 新增员工
     * @param entity
     * @return
     */
    public int insertArtisan(Personnel entity) {
	return dao.insert(entity);
    }
    
    /**
     * 修改员工信息
     * @param entity 员工实体
     * @return
     */
    public int modifyArtisan(Personnel entity) {
	return dao.updateById(entity);
    }
    
    /**
     * 删除员工信息
     * @param id 员工编号
     * @return
     */
    public int removeArtisan(String id) {
	return dao.deleteById(id);
    }
}

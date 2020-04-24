package com.accp.biz.yld;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yld.artisanGroupDao;
import com.accp.pojo.Personnel;
import com.accp.pojo.Workergroup;
import com.accp.vo.yld.artisanGroupVo;
import com.accp.vo.yld.workerVo;
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
    public PageInfo<artisanGroupVo> queryAll(int c, int s,String name){
	PageHelper.startPage(c,s);
	return new PageInfo<artisanGroupVo>(dao.queryAll(name));
    }
    
    public int updatePreson(Personnel entity) {
	return dao.updateById(entity);
    }
    
    public List<workerVo> queryPreson(){
	return dao.queryPreson();
    }
}

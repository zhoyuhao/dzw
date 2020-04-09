package com.accp.biz.yld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yld.artisanDao;
import com.accp.pojo.Workergroup;
import com.accp.vo.yld.artisanVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.SUPPORTS, readOnly = true)
public class artisanBiz {

    @Autowired
    private artisanDao dao;

    /**
     * 查询所有员工信息并分页
     * 
     * @param c    当前页
     * @param s    数据量
     * @param bzid
     * @param name
     * @return
     */
    public PageInfo<artisanVo> queryAll(int c, int s, Integer bzid, String name) {
	PageHelper.startPage(c, s);
	return new PageInfo<artisanVo>(dao.queryAll(bzid, name));
    }

    /**
     * 
     * @param id 编号
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, readOnly = false)
    public int removeArtisan(String id) {
	return dao.deleteById(id);
    }

    /**
     * 查询所有班组信息
     * 
     * @param c
     * @param s
     * @param name
     * @param name
     * @return
     */
    public PageInfo<Workergroup> queryAllWorkerGroup(int c, int s, String name) {
	PageHelper.startPage(c, s);
	return new PageInfo<Workergroup>(dao.queryAllWorkerGroup(name));
    }
}

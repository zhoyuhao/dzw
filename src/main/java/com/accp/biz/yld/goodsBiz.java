package com.accp.biz.yld;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yld.goodsDao;
import com.accp.pojo.Goods;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
public class goodsBiz {

    @Autowired
    private goodsDao dao;
    
    public PageInfo<Goods> queryAll(int c,int s,String name, String type){
	boolean iftrue = true;
	if(type.equals("") || type == null) {
	    iftrue = false;
	}
	PageHelper.startPage(c,s);
	QueryWrapper<Goods> qw = Wrappers.query();
	qw.like("gname", name).eq(iftrue, "type", type);
	return new PageInfo<Goods>(dao.selectList(qw));
    }
    
    public List<Goods> queryByTypeId(String typeid){
	QueryWrapper<Goods> qw = Wrappers.query();
	qw.eq("type", typeid);
	return dao.selectList(qw);
    }
    
    public int updateGoods(Goods entity) {
	return dao.updateById(entity);
    }

}

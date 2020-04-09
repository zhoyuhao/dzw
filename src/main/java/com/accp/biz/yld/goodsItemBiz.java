package com.accp.biz.yld;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yld.goodsitemDao;
import com.accp.pojo.Serviceitem;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
public class goodsItemBiz {

    @Autowired
    private goodsitemDao dao;
    
    public List<Serviceitem> queryAll(){
	return dao.selectList(null);
    }
    
    public PageInfo<Serviceitem> queryAllByPage(int c, int s, String name){
	PageHelper.startPage(c,s);
	return new PageInfo<Serviceitem>(dao.queryAllByPage(name));
    }
    
    public int insertGoodsItem(Serviceitem entity) {
	return dao.insert(entity);
    }
    
    public int updateGoodsItem(Serviceitem entity) {
	return dao.updateById(entity);
    }
    
    public int deleteGoodsItem(int id) {
	return dao.deleteById(id);
    }

}

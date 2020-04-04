package com.accp.biz.lc;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lc.lcGoodsMapper;
import com.accp.vo.lc.lcGoodsVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class lcGoodsBiz {

	@Autowired
	private lcGoodsMapper lcdao;
	
	//查询商品信息根据ghsid查询供应商
	public PageInfo<lcGoodsVo> queryall(Integer pageNum,Integer pageSize,String gname){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<lcGoodsVo>(lcdao.queryall(gname));
	}
	//删除商品信息
	@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int removeGoods(Integer gid) {
		return lcdao.deleteById(gid);
	}
	
	//新增商品信息
	@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = false)
	public int saveGoods(lcGoodsVo staff) {
		return lcdao.insert(staff);
	}

	
	//傳參查詢并修改
	public lcGoodsVo querybyid(Integer gid) {
		return lcdao.queryByid(gid);
	}
	//修改商品信息
		@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = false)
		public int moidelGoods(lcGoodsVo staff) {
			return lcdao.updateById(staff);
		}
	
	
}

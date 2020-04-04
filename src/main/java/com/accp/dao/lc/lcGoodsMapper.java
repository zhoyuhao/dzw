package com.accp.dao.lc;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.lc.lcGoodsVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;



public interface lcGoodsMapper extends BaseMapper<lcGoodsVo> {
	//查询商品信息根据ghsid查询供应商
	List<lcGoodsVo> queryall(@Param("gname")String gname);
	
	lcGoodsVo queryByid(@Param("gid")Integer gid);
	

}

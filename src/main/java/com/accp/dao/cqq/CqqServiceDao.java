package com.accp.dao.cqq;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Service;
import com.accp.vo.cqq.ChongZhiList;
import com.accp.vo.cqq.CqqServiceVo;
import com.accp.vo.zyh.zyhpersonnel_vo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface CqqServiceDao extends BaseMapper<Service> {

	List<CqqServiceVo> queryall(@Param("wid") Integer wid, @Param("name") String name);
	
	List<ChongZhiList> queryChongZhi(@Param("val") String val);
	 
	Integer selectGoods(@Param ("id")Integer id);
	
	Integer huiyuanMoneyAddJiLu(@Param ("val")String  val,@Param ("id")String  id);
	
	
	List<zyhpersonnel_vo>queryLiZhi(@Param("pstatic")Integer pstatic, @Param("pname") String name);
}

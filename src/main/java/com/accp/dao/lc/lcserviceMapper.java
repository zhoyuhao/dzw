package com.accp.dao.lc;

import java.util.Date;
import java.util.List;

import com.accp.vo.lc.lcserviceVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface lcserviceMapper extends BaseMapper<lcserviceVo> {
	//首页显示
	
	
	//1.结算次数
	public lcserviceVo querybycount(String paymenttirm);
	
	//2.现金收入
	public lcserviceVo queryxianjin(String paymenttirm);
	
	//3.今日在修台次
	public lcserviceVo queryzaixiutaici(String wstatdate);
}

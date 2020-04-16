package com.accp.dao.lc;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.lc.lcpersonnelVo;
import com.accp.vo.lc.lcpersonnelsVo;
import com.accp.vo.lc.lcserviceVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


public interface lcPersonnelMapper extends BaseMapper<lcpersonnelsVo> {
	//查询所有员工资料
	public List<lcpersonnelVo> queryalOrName(@Param("pname")String pname);
	
	//删除员工根据主键删除员工角色
	public int romoveyg(@Param("pid")String pid);
	
	
	public lcpersonnelVo queryByid(@Param("pid")String pid);
	
	int inserss(@Param("a")lcpersonnelVo a);
}

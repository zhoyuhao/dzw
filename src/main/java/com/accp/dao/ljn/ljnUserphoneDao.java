package com.accp.dao.ljn;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Userphone;
import com.accp.vo.ljn.voUserphone;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface ljnUserphoneDao extends BaseMapper<voUserphone>{

	//查询通讯录信息
	List<voUserphone>query(@Param("pname") String pname);
	
	//新增通讯录信息
	int add(@Param("pid") String pid,@Param("pname") String pname,@Param("pphone") String pphone);

	//删除通讯录信息
	int remove(@Param("id") Integer id);
	
	//修改通讯录信息
	int update(@Param("us") Userphone us);
	
	//根据编号查询通讯录信息
	Userphone queryid(@Param("txlid") int txlid);
	
	//查询编号是否已存在
	int count(@Param("pid") int pid);
}

package com.accp.dao.ljn;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Service;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface ljnServiceDao{

	List<Service> query();
	
	int update(@Param("wid") int wid);
}

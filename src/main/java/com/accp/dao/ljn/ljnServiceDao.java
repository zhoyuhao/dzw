package com.accp.dao.ljn;

import java.util.List;

import com.accp.pojo.Service;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface ljnServiceDao{

	List<Service> query();
}

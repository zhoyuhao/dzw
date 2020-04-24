package com.accp.dao.cqq;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Service;
import com.accp.vo.cqq.CqqServiceVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface CqqServiceDao extends BaseMapper<Service> {

	List<CqqServiceVo> queryall(@Param("wid") Integer wid, @Param("name") String name);
}

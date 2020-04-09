package com.accp.dao.yld;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Serviceitem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface goodsitemDao extends BaseMapper<Serviceitem>{

    List<Serviceitem> queryAllByPage(@Param("name")String name);
}

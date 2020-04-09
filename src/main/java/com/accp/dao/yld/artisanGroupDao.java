package com.accp.dao.yld;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Personnel;
import com.accp.vo.yld.artisanGroupVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface artisanGroupDao extends BaseMapper<Personnel> {

    List<artisanGroupVo> queryAll(@Param("name")String name);
}

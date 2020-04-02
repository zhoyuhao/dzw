package com.accp.dao.yld;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Personnel;
import com.accp.vo.yld.artisanVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

//技工表Dao
public interface artisanDao extends BaseMapper<Personnel> {
    
    List<artisanVo> queryAll();

    artisanVo queryById(@Param("pid") String pid);
    
}

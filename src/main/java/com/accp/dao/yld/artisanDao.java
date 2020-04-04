package com.accp.dao.yld;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Personnel;
import com.accp.pojo.Workergroup;
import com.accp.vo.yld.artisanVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

//技工表Dao
public interface artisanDao extends BaseMapper<Workergroup> {
    
    List<artisanVo> queryAll(@Param("bzid") Integer bzid,@Param("name") String name);

    artisanVo queryById(@Param("pid") String pid);
    
    Long queryMaxId ();
    
    List<Workergroup> queryAllWorkerGroup(@Param("name") String name);
}

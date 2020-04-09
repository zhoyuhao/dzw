package com.accp.dao.yld;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Service;
import com.accp.vo.yld.serviceVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface serviceDao extends BaseMapper<Service>{

    List<serviceVo> queryAllServicePage(@Param("wcarid")String wcarid,@Param("wstatic")Integer wstatic);
    
    Long queryMaxId();
}

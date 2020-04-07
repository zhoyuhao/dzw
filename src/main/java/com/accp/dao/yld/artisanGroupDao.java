package com.accp.dao.yld;

import java.util.List;

import com.accp.pojo.Workergroup;
import com.accp.vo.yld.artisanGroupVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface artisanGroupDao extends BaseMapper<Workergroup> {

    List<artisanGroupVo> queryAll();
}

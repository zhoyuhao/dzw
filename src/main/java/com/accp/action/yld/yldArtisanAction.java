package com.accp.action.yld;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yld.artisanGroupBiz;
import com.accp.biz.yld.workerBiz;
import com.accp.biz.yld.artisanBiz;
import com.accp.pojo.Personnel;
import com.accp.pojo.Workergroup;
import com.accp.vo.yld.artisanGroupVo;
import com.accp.vo.yld.artisanVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/yldaction/api")
public class yldArtisanAction {

    @Autowired
    private artisanBiz abiz;
    @Autowired
    private artisanGroupBiz agbiz;
    @Autowired
    private workerBiz wbiz;
    
    //分页查询技工
    @GetMapping("/queryartisan")
    public PageInfo<artisanVo> queryartisan(Integer c, Integer bzid, String name) {
	return abiz.queryAll(c, 4, bzid, name);
    }
    
    //分页查询技工班组
    @GetMapping("/queryartisangroup")
    public PageInfo<artisanGroupVo> queryartisanGroup(Integer c) {
	return agbiz.queryAll(c, 4);
    }

    //分页查询所有班组和技工星级
    @GetMapping("/queryPageWork")
    public PageInfo<Workergroup> queryAllWorkerGroupTogglePage(int page, String name){
	return abiz.queryAllWorkerGroup(page, 4, name);
    }
    //查询所有班组和技工星级
    @GetMapping("/queryWork")
    public List<Workergroup> queryAllWorkerGroup(){
	return wbiz.queryAll();
    }
    
    //添加技工星级
    @PostMapping("/insertewgroup")
    public String insertEmpWorkerGroup(@RequestBody Workergroup entity) {
	if(wbiz.insertWorkerGroup(entity) > 0) {
	    return "ok";
	}
	return "no";
    }
}

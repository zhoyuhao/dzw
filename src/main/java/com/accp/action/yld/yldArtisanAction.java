package com.accp.action.yld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yld.aritsanGroupBiz;
import com.accp.biz.yld.artisanBiz;
import com.accp.pojo.Personnel;
import com.accp.pojo.Workergroup;
import com.accp.vo.yld.artisanGroupVo;
import com.accp.vo.yld.artisanVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/yldaction/api")
public class yldArtisanAction {

    @Autowired
    private artisanBiz abiz;
    @Autowired
    private aritsanGroupBiz agbiz;
    
    //分页查询技工
    @GetMapping("/queryartisan")
    public PageInfo<artisanVo> queryartisan() {
	return abiz.queryAll(1, 4);
    }
    
    //分页查询技工班组
    @GetMapping("/queryartisangroup")
    public PageInfo<artisanGroupVo> queryartisanGroup() {
	return agbiz.queryAll(1, 4);
    }
    
    //添加技工
    @PostMapping("/addartisan")
    public String insertArtisan(Personnel entity) {
	if(abiz.insertArtisan(entity)>0) {
	    return "ok";
	}
	return "no";
    }
    
    //添加技工组
    @PostMapping("/addartisangroup")
    public String insertArtisanGroup(Workergroup entity) {
	if (agbiz.insertAgroup(entity)>0) {
	    return "ok";
	}
	return "no";
    }
    
    //删除技工
    @DeleteMapping("/removeartisan")
    public String removeArtisan(String id) {
	if (abiz.removeArtisan(id)>0) {
	    return "ok";
	}
	return "no";
    }
    
    //删除技工班组
    @DeleteMapping("/removeartisangroup")
    public String removeArtisanGroup(String id) {
	if (agbiz.removeAgroup(id)>0) {
	    return "ok";
	}
	return "no";
    }
    
    //修改技工
    @PutMapping("/updateartisan")
    public String modifyArtisan(Personnel entity) {
	if (abiz.modifyArtisan(entity)>0) {
	    return "ok";
	}
	return "no";
    }
    
    //修改技工
    @PutMapping("/updateartisangroup")
    public String modifyArtisanGroup(Workergroup entity) {
	if (agbiz.modifyAgroup(entity)>0) {
	    return "ok";
	}
	return "no";
    }
}

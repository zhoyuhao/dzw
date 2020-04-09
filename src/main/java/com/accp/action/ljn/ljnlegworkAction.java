package com.accp.action.ljn;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljn.ljnlegworkBiz;
import com.accp.pojo.Legwork;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("ljn/api/ljnlegworkAction")
public class ljnlegworkAction {

	@Resource ljnlegworkBiz biz;
	@GetMapping("query/{pageNum}/{state}")
	//查询外勤车辆信息
	public PageInfo<Legwork> query(@PathVariable int pageNum,@PathVariable String state) {
		return biz.query(pageNum,state);
	}
	@GetMapping("delete/{legworkid}")
	//删除外勤车辆信息
	public int delete(@PathVariable int legworkid) {
		return biz.delete(legworkid);
	}
	@PostMapping("update")
	//修改外勤车辆信息
	public int update(@RequestBody Legwork entity) {
		return biz.update(entity);
	}
	@PostMapping("insert")
	//新增外勤车辆信息
	public int insert(@RequestBody Legwork entity) {
		return biz.insert(entity);
	}
	@GetMapping("queryid/{legworkid}")
	//查询指定外勤车辆信息
	public Legwork queryid(@PathVariable int legworkid) {
		return biz.queryid(legworkid);
	}
}

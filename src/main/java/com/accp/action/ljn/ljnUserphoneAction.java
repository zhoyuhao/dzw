package com.accp.action.ljn;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljn.ljnUserphoneBiz;
import com.accp.pojo.Userphone;
import com.accp.vo.ljn.voUserphone;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("ljn/api/ljnUserphoneAction")
public class ljnUserphoneAction {

	@Resource ljnUserphoneBiz biz;
	//查询通讯录信息
	@GetMapping("query/{pageNum}/{pname}")
	public PageInfo<voUserphone> query(@PathVariable int pageNum,@PathVariable String pname) {
		if(pname.equals("null")||pname.equals(null)) {
			pname="";
		}
		return biz.query(pageNum,pname);
	}
	//新增通讯录信息
	@GetMapping("add/{pid}/{pname}/{pphone}")
	public int add(@PathVariable String pid,@PathVariable String pname,@PathVariable String pphone) {
		return biz.add(pid, pname, pphone);
	}
	//删除通讯录信息
	@GetMapping("remove/{id}")
	public int remove(@PathVariable int id) {
		return biz.remove(id);
	}
	//修改通讯录信息
	@PostMapping("update")
	public int update(@RequestBody Userphone us) {
		return biz.update(us);
	}
	//根据编号查询通讯录信息
	@GetMapping("queryid/{txlid}")
	public Userphone queryid(@PathVariable int txlid) {
		return biz.queryid(txlid);
	}
}

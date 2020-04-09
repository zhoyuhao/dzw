package com.accp.action.lc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lc.lcPersonnelBiz;
import com.accp.biz.lc.lcworkergroupBiz;
import com.accp.vo.lc.lcGoodsVo;
import com.accp.vo.lc.lcpersonnelVo;
import com.accp.vo.lc.lcpersonnelsVo;
import com.accp.vo.lc.lcworkergroupVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/lc/api/lcpersonnels")
public class lcPersonnelAction {

	@Autowired
	private lcPersonnelBiz biz;

	// workergroup表
	@Autowired
	private lcworkergroupBiz bizs;

	@GetMapping("sss/ssh")
	public List<lcworkergroupVo> queryall() {
		return bizs.querall();
	}

	@GetMapping("/{n}/{s}/{pname}")
	public PageInfo<lcpersonnelVo> queryallOrname(@PathVariable Integer n, @PathVariable Integer s,
			@PathVariable String pname) {
		if ("null".equals(pname) || "".equals(pname)) {
			pname = null;
		}
		return biz.queryall(n, s, pname);
	}

	@DeleteMapping("shan/{pId}")
	public Map<String, Object> removeGoods(@PathVariable String pId) {
		Map<String, Object> map = new HashMap<String, Object>();
		biz.removeyg(pId);
		if (pId != null) {
			map.put("code", "200");
			map.put("msg", "删除成功");
		} else {
			map.put("code", "500");
			map.put("msg", "删除失败");
		}
		return map;
	}

	@GetMapping("{pid}")
	public lcpersonnelVo queryOne(@PathVariable String pid) {
		return biz.queryByid(pid);
	}


	//修改商品信息
		@PutMapping("modeil")
		public Map<String, Object> modeilGoods(@RequestBody lcpersonnelsVo lcss) {
			int count=biz.modeilid(lcss);
			Map<String, Object> map=new HashMap<String, Object>();
			if(count!=0) {
				map.put("code", "200");
				map.put("msg", "修改成功");
			}else {
				map.put("code", "500");
				map.put("msg", "失敗失败");
			}
			return map;
		}
		//新增商品信息
		@PostMapping("addGoods")
		public Map<String, Object> saveGoods(@RequestBody lcpersonnelsVo lcss) {
			int count=biz.saveaa(lcss);
			Map<String, Object> map=new HashMap<String, Object>();
			if(count!=0) {
				map.put("code", "200");
				map.put("msg", "新增成功");
			}else {
				map.put("code", "500");
				map.put("msg", "新增失败");
			}
			return map;
		}
}

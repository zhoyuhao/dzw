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

import com.accp.biz.lc.lcGoodsBiz;
import com.accp.biz.lc.lcSupplierBiz;
import com.accp.vo.lc.lcGoodsVo;
import com.accp.vo.lc.lcSupplierVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/lc/api/Goods")
public class lcGoodsAction {

	@Autowired
	private lcGoodsBiz lcBiz;
	
	@Autowired
	private lcSupplierBiz lcBizs;
	
	/*
	 * 商品资料管理查询
	 */
	@GetMapping("{p}/{s}/{gname}")
	public PageInfo<lcGoodsVo> queryall(@PathVariable Integer p,@PathVariable Integer s,@PathVariable String gname){
		
		if("null".equals(gname)) {
			gname=null;
		}
		System.out.println(gname);
		return lcBiz.queryall(p, s,gname);
		
	}
	
	/*
	 * 删除商品信息
	 */
	@DeleteMapping("shanchu/{gid}")
	public Map<String, Object> removeGoods(@PathVariable Integer gid) {
		Map<String, Object> map=new HashMap<String, Object>();
		lcBiz.removeGoods(gid);
		if(gid!=null) {
			map.put("code", "200");
			map.put("msg", "删除成功");
		}else {
			map.put("code", "500");
			map.put("msg", "删除失败");
		}
		return map;
	}
	
	//查询所有供应商编号新增
	@GetMapping("/sup")
	public List<lcSupplierVo> lcqueryall(){
		return lcBizs.queryall();
	}
	//新增商品信息
	@PostMapping("addGoods")
	public Map<String, Object> saveGoods(@RequestBody lcGoodsVo staff) {
		int count=lcBiz.saveGoods(staff);
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
	
	//根據id查詢
	@GetMapping("ids/{gid}")
	public lcGoodsVo queryByid(@PathVariable Integer gid) {
		return lcBiz.querybyid(gid);
	}
	
	//修改商品信息
	@PutMapping("modeil")
	public Map<String, Object> modeilGoods(@RequestBody lcGoodsVo staff) {
		int count=lcBiz.moidelGoods(staff);
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
	
	
}

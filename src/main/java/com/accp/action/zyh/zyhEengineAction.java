package com.accp.action.zyh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zyh.zyhEengineBiz;
import com.accp.pojo.Eengine;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@RestController
@RequestMapping("zyhEengineAction/api")
public class zyhEengineAction {
		
	
	@Autowired
	private zyhEengineBiz biz;
	
	/**查看所有 或者 模糊查看
	 * 
	 * @param name
	 * @return
	 */
	@GetMapping("queryAll/{name}")
	public List<Eengine> queryAll(@PathVariable String name){
		name="null".equals(name)?"":name;
		return biz.queryAll(name);
	}
	
	/**根据id删除
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("delete/{id}")
	public int delete(@PathVariable Integer id) {
		return biz.delete(id);
	}
	
	/**添加发动机
	 * 
	 * @param entity
	 * @return
	 */
	@PostMapping("eengineAdd")
	public int eengineAdd(@RequestBody Eengine entity) {
		return biz.eengineAdd(entity);
	}
}

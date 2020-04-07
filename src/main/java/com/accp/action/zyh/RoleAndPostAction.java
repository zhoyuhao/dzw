package com.accp.action.zyh;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zyh.zyhPostBiz;
import com.accp.pojo.Post;
import com.accp.pojo.Role;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@RestController
@RequestMapping("RoleAndPostAction/api")
public class RoleAndPostAction {

	
	@Autowired
	private zyhPostBiz biz;
	
	
	/**岗位添加
	 * 
	 * @param entity
	 * @return
	 */
	@PostMapping("insert")
	public int insert(@RequestBody Post entity) {
		return biz.insert(entity);
	}
	
	/**根据id删除岗位
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("deleteById/{id}")
	public int deleteById(@PathVariable Integer id) {
		return biz.deleteById(id);
	}
	
	/**角色添加
	 * 
	 * @param entity
	 * @return
	 */
	@PostMapping("roleAdd")
	public int roleAdd(@RequestBody Role entity) {
		return biz.roleAdd(entity);
	}
	
	/**角色删除
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("deleteRole/{id}")
	public int deleteRole(@PathVariable Integer id) {
		return biz.deleteRole(id);
	}
	
	/***角色查看
	 * @param id
	 * @param name
	 * @return
	 */
	@GetMapping("roleQueryAll/{id}/{name}")
	public List<Role> roleQueryAll(@PathVariable Integer id ,@PathVariable String name){
		name="null".equals(name)?null:name;
		return biz.roleQueryAll(id,name);
	}
	
	/**崗位查看
	 * 
	 * @param id
	 * @param name
	 * @return
	 */
	@GetMapping("postQueryAll/{id}/{name}")
	public List<Post> postQueryAll(@PathVariable Integer id ,@PathVariable  String name){
		name="null".equals(name)?null:name;
		return biz.postQueryAll(id, name);
		
	}
}

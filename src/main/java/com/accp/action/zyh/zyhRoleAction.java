package com.accp.action.zyh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zyh.zyhRoleBiz;
import com.accp.vo.zyh.zyhFunction_vo;
import com.accp.vo.zyh.zyhRole_vo;
import com.accp.vo.zyh.zyhRoleandfunction_vo;




@RestController
@RequestMapping("zyhRoleAction/api")
public class zyhRoleAction {

	@Autowired
	private zyhRoleBiz biz;

	/**查看所有 角色 的权限和 用角色的用户
	 * 
	 * @return
	 */
	@GetMapping("queryAll")
	public List<zyhRole_vo> queryAll(){
		return biz.queryAll();
	}
	
	/**查看所有权限
	 * @return
	 */
	@GetMapping("qxAll")
	public List<zyhFunction_vo> qxAll(){
		return biz.qxAll();
				
	}
	
	/**根据角色id删除这个角色所有权限
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("deteteByName/{id}")
	public int deteteByName(@PathVariable Integer id) {
		return biz.deteteByName(id);
	}
	
	/**给指点的角色添加权限
	 * 
	 * @param list
	 * @return
	 */
	@PostMapping("roleAdd")
	public int roleAdd(@RequestBody List<zyhRoleandfunction_vo> p) {
//	if(biz.deteteByName(p.get(0).getCid())!=0) {
//			return biz.roleAdd(p);
//	}
	return biz.roleAdd(p);
		//return 0;
	}
}

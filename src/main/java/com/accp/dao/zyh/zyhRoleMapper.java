package com.accp.dao.zyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.*;
import com.accp.vo.zyh.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface zyhRoleMapper extends BaseMapper<Role>{
 
	/**查看所有 角色 的权限和 用角色的用户
	 * 
	 * @return
	 */
	List<zyhRole_vo> queryAll();
	
	/**查看所有权限
	 * @return
	 */
	List<zyhFunction_vo> qxAll();
	
	/**根据角色id删除这个角色所有权限
	 * 
	 * @param id
	 * @return
	 */
	int deteteByName(@Param("id")Integer id);
	
	/**给指点的角色添加权限
	 * 
	 * @param list
	 * @return
	 */
	int roleAdd(@Param("list")List<zyhRoleandfunction_vo> list);
}
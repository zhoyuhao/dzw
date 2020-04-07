package com.accp.dao.zyh;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Post;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface zyhPostMapper extends BaseMapper<Post>{
   
	/**查看是否正在使用
	 * 
	 * @param id
	 * @return
	 */
	int selectPersonnel(@Param("postOrRole") Integer id);
	
	

	/**查看是否正在使用
	 * 
	 * @param id
	 * @return
	 */
	int selectUersandrole(@Param("id") Integer id);
	
	

}
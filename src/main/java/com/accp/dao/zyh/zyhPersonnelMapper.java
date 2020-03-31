package com.accp.dao.zyh;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Personnel;
import com.accp.vo.zyh.*;

public interface zyhPersonnelMapper {
   
	/***登入
	 * 
	 * @param name
	 * @param pwd
	 * @return
	 */
	zyhpersonnel_vo querylogin(@Param("name")String name,@Param("pwd")String pwd);
}
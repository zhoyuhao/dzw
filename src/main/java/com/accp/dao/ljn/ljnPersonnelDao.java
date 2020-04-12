package com.accp.dao.ljn;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.accp.pojo.Personnel;

public interface ljnPersonnelDao {

		List<Personnel> query();
		
		int queryid(@PathVariable int pid);
}

package com.accp.dao.ljn;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;

import com.accp.pojo.Personnel;

public interface ljnPersonnelDao {

		List<Personnel> query();
		
		Personnel queryid(@PathParam("pname") String pname);
}

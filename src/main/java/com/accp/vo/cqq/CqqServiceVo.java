package com.accp.vo.cqq;

import java.util.List;

/**
 * 	
维修开单表vo
 */
import com.accp.pojo.Service;
import com.accp.pojo.Servicedetailed;

public class CqqServiceVo {

	private Service service;// 维修开单表、竣工检验

	private List<Servicedetailed> list;// 维修详细

	public CqqServiceVo() {
		super();
	}

	public CqqServiceVo(Service service, List<Servicedetailed> list) {
		super();
		this.service = service;
		this.list = list;
	}

	@Override
	public String toString() {
		return "CqqServiceVo [service=" + service + ", list=" + list + "]";
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public List<Servicedetailed> getList() {
		return list;
	}

	public void setList(List<Servicedetailed> list) {
		this.list = list;
	}

}

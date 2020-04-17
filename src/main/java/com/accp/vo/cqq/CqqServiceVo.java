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

	private List<Servicedetailed> serdetalist;// 维修详细

	@Override
	public String toString() {
		return "CqqServiceVo [service=" + service + ", serdetalist=" + serdetalist + "]";
	}

	public CqqServiceVo() {
		super();
	}

	public CqqServiceVo(Service service, List<Servicedetailed> serdetalist) {
		super();
		this.service = service;
		this.serdetalist = serdetalist;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public List<Servicedetailed> getSerdetalist() {
		return serdetalist;
	}

	public void setSerdetalist(List<Servicedetailed> serdetalist) {
		this.serdetalist = serdetalist;
	}

}

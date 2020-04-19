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

	private Integer sum;

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

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public CqqServiceVo(Service service, List<Servicedetailed> serdetalist, Integer sum) {
		super();
		this.service = service;
		this.serdetalist = serdetalist;
		this.sum = sum;
	}

	public CqqServiceVo() {
		super();
	}

	@Override
	public String toString() {
		return "CqqServiceVo [service=" + service + ", serdetalist=" + serdetalist + ", sum=" + sum + "]";
	}

}

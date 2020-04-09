package com.accp.action.lc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lc.lcserviceBiz;
import com.accp.vo.lc.lcserviceVo;

@RestController
@RequestMapping("/lc/api/services")
public class lcserviceAction {
	
	@Autowired
	private lcserviceBiz biz;
	
	@GetMapping("")
	public lcserviceVo querybydate(){
		Date date=new Date();
		  DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		  String paymenttirm=format.format(date);
		return biz.queryall(paymenttirm);
	}
	@GetMapping("/xianjin")
	public lcserviceVo querybyxianjin(){
		Date date=new Date();
		  DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		  String paymenttirm=format.format(date);
		return biz.queryallbyxianjin(paymenttirm);
	}
	
	@GetMapping("/zaixiu")
	public lcserviceVo querybyzaixiu(){
		Date date=new Date();
		  DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		  String wstatdate=format.format(date);
		return biz.queryallzaixiu(wstatdate);
	}
	
	

}

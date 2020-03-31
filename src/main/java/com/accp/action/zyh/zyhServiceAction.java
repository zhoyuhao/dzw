package com.accp.action.zyh;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zyh.*;
import com.accp.vo.zyh.zyhService_vo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("zyhServiceAction/api")
public class zyhServiceAction {

	@Autowired
	private zyhServiceBiz biz;
	
	

	/**查看为维修单的状态
	 * 
	 * @return
	 */
	@GetMapping("queryStatucBy1Or2/{wcarid}/{statdate}/{enedate}/{n}/{s}/{statuc}/{statuc2}")
	public PageInfo<zyhService_vo> queryStatucBy1Or2(@PathVariable String wcarid,@PathVariable String statdate,
															@PathVariable String enedate,@PathVariable Integer n,
															@PathVariable Integer s,@PathVariable Integer statuc,
															@PathVariable Integer statuc2){
		wcarid="null".equals(wcarid)?null:wcarid;
		statdate="null".equals(statdate)?null:statdate;
		enedate="null".equals(enedate)?null:enedate;
		if(statdate!=null) {
			statdate=this.parseDate(statdate);
			enedate=this.parseDate(enedate);
		}
		
		return biz.queryStatucBy1Or2(wcarid,statdate,enedate,n,s,statuc, statuc2) ;
	}
	
	/**时间转换
	 * 
	 * @param val
	 * @return
	 * @throws ParseException
	 */
	public  String parseDate(String val){
		val = val.replace("GMT", "").replaceAll("\\(.*\\)", ""); 
		 //将字符串转化为date类型，格式2016-10-12 
		 SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd yyyy hh:mm:ss z",Locale.ENGLISH); 
		 Date dateTrans;
		try {
			dateTrans = format.parse(val);
			return new SimpleDateFormat("yyyy-MM-dd").format(dateTrans); 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
		}
}

package com.accp.action.zyh;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zyh.*;
import com.accp.pojo.Goods;
import com.accp.pojo.Servicedetailed;
import com.accp.vo.zyh.zyhService_vo;
import com.accp.vo.zyh.zyhServicedetailed_vo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("zyhServiceAction/api")
public class zyhServiceAction {

	@Autowired
	private zyhServiceBiz biz;
	
	
	/**根据id修改维修状态
	 * 
	 * @param statuc
	 * @param id
	 * @return
	 */
	@PutMapping("updateByWidToStatuc/{statuc}/{id}")
	public int updateByWidToStatuc(@PathVariable Integer statuc,@PathVariable String id) {
		return biz.updateByWidToStatuc(statuc, id);
	}
	
	/**客户返工添加项目
	 * 
	 * @param list
	 * @return
	 */
	@PostMapping("serivceDetailedAdd")
	public int serivceDetailedAdd(@RequestBody List<zyhServicedetailed_vo> list) {
		return biz.serivceDetailedAdd(list);
	}

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
	
	/**查看有几种车型的商品
	 * 
	 * @return
	 */
	@GetMapping("queryByCarType")
	public List<Goods> queryByCarType(){
		return biz.queryByCarType();
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

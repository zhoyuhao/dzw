package com.accp.biz.zyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zyh.zyhServiceMapper;
import com.accp.vo.zyh.zyhService_vo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class zyhServiceBiz {
		@Autowired
		private zyhServiceMapper dao;
		

		/**查看为维修单的状态
		 * 
		 * @return
		 */
		public PageInfo<zyhService_vo> queryStatucBy1Or2(String wcarid,String statdate,String enddate,
															Integer n,Integer s,Integer statuc,Integer statuc2){
			PageHelper.startPage(n, s);
			return new PageInfo<zyhService_vo>(dao.queryStatucBy1Or2(wcarid,statdate,enddate,statuc, statuc2)) ;
		}
	
}

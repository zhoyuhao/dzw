package com.accp.biz.zyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zyh.*;
import com.accp.dao.zyh.zyhServiceMapper;
import com.accp.pojo.Goods;
import com.accp.pojo.Servicedetailed;
import com.accp.vo.zyh.zyhService_vo;
import com.accp.vo.zyh.zyhServicedetailed_vo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS,isolation = Isolation.READ_COMMITTED,readOnly = true)
public class zyhServiceBiz {
		@Autowired
		private zyhServiceMapper dao;
		
		@Autowired
		private zyhGoodsBiz zyhGoodsBiz;

		/**查看有几种车型的商品
		 * 
		 * @return
		 */
		public List<Goods> queryByCarType(){
			return zyhGoodsBiz.queryByCarType();
		}
		

		/**客户返工添加项目
		 * 
		 * @param list
		 * @return
		 */
		public int serivceDetailedAdd(List<zyhServicedetailed_vo> list) {
			return dao.serivceDetailedAdd(list);
		}
		
		/**查看为维修单的状态
		 * 
		 * @return
		 */
		public PageInfo<zyhService_vo> queryStatucBy1Or2(String wcarid,String statdate,String enddate,
														Integer n,Integer s,Integer statuc,Integer statuc2){
		
			PageHelper.startPage(n, s);
			return new PageInfo<zyhService_vo>(dao.queryStatucBy1Or2(wcarid,statdate,enddate,statuc, statuc2)) ;
		}
		
		/**根据id修改维修状态
		 * 
		 * @param statuc
		 * @param id
		 * @return
		 */
		@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
		public int updateByWidToStatuc(Integer statuc,String id,String date,Float gs,Integer gsf) {
			return dao.updateByWidToStatuc(statuc, id,date,gs,gsf);
		}
}

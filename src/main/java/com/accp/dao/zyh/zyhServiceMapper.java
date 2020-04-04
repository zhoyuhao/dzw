package com.accp.dao.zyh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Service;
import com.accp.pojo.Servicedetailed;
import com.accp.vo.zyh.*;

public interface zyhServiceMapper {
  
	
	/**查看为维修单的状态
	 * 
	 * @return
	 */
	List<zyhService_vo> queryStatucBy1Or2(@Param("wcarid")String wcarid,@Param("statdate")String statdate,
					@Param("enddate")String enddate,@Param("statuc")Integer statuc,@Param("statuc2")Integer statuc2);
	
	/**根据id修改维修状态
	 * 
	 * @param statuc
	 * @param id
	 * @return
	 */
	int updateByWidToStatuc(@Param("statuc")Integer statuc,@Param("wid")String wid,
											@Param("date")String date,@Param("gs")Float gs,@Param("gsf")Integer gsf);
	
	/**客户返工添加项目
	 * 
	 * @param list
	 * @return
	 */
	int serivceDetailedAdd(@Param("list") List<zyhServicedetailed_vo> list);
}
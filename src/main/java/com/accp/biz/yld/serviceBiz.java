package com.accp.biz.yld;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yld.serviceDao;
import com.accp.vo.yld.serviceVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
public class serviceBiz {

    @Autowired
    private serviceDao dao;

    public PageInfo<serviceVo> queryServiceInfo(int c, int s, String wcarid, Integer wstatic) {
	PageHelper.startPage(c, s);
	return new PageInfo<serviceVo>(dao.queryAllServicePage(wcarid, wstatic));
    }
    
    public Long queryMaxId() {
	Long id = dao.queryMaxId();
	if(id == null) {
	    Calendar time = Calendar.getInstance();
	    time.setTime(new Date());
	    id = Long.parseLong(time.get(Calendar.YEAR)+""+(time.get(Calendar.MONTH)+1)+""+time.get(Calendar.DAY_OF_MONTH)+"0");
	}
	return id;
    }
    
    public int insertService(com.accp.pojo.Service entity) {
	return dao.insert(entity);
    }
}

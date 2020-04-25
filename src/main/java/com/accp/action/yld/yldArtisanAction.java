package com.accp.action.yld;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yld.artisanGroupBiz;
import com.accp.biz.yld.customerBiz;
import com.accp.biz.yld.customerCarBiz;
import com.accp.biz.yld.goodsBiz;
import com.accp.biz.yld.goodsItemBiz;
import com.accp.biz.yld.legworkBiz;
import com.accp.biz.yld.serviceBiz;
import com.accp.biz.yld.serviceInfoBiz;
import com.accp.biz.yld.serviceStatusBiz;
import com.accp.biz.yld.workerBiz;
import com.accp.biz.yld.artisanBiz;
import com.accp.pojo.Customer;
import com.accp.pojo.Customercar;
import com.accp.pojo.Goods;
import com.accp.pojo.Legwork;
import com.accp.pojo.Personnel;
import com.accp.pojo.Service;
import com.accp.pojo.Servicedetailed;
import com.accp.pojo.Serviceitem;
import com.accp.pojo.Statucs;
import com.accp.pojo.Workergroup;
import com.accp.vo.yld.artisanGroupVo;
import com.accp.vo.yld.artisanVo;
import com.accp.vo.yld.customerVo;
import com.accp.vo.yld.serviceVo;
import com.accp.vo.yld.workerVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/yldaction/api")
public class yldArtisanAction {

    @Autowired
    private artisanBiz abiz;
    @Autowired
    private artisanGroupBiz agbiz;
    @Autowired
    private workerBiz wbiz;
    @Autowired
    private goodsBiz gbiz;
    @Autowired
    private goodsItemBiz gibiz;
    @Autowired
    private serviceBiz sbiz;
    @Autowired
    private serviceStatusBiz stbiz;
    @Autowired
    private serviceInfoBiz sibiz;
    @Autowired
    private legworkBiz lbiz;
    @Autowired
    private customerBiz cbiz;
    @Autowired
    private customerCarBiz ccbiz;
    
    // 分页查询技工
    @GetMapping("/queryartisan")
    public PageInfo<artisanVo> queryartisan(Integer c, Integer bzid, String name) {
	return abiz.queryAll(c, 4, bzid, name);
    }

    // 分页查询技工班组
    @GetMapping("/queryartisangroup")
    public PageInfo<artisanGroupVo> queryartisanGroup(Integer c, String name) {
	return agbiz.queryAll(c, 4, name);
    }

    // 分页查询所有班组和技工星级
    @GetMapping("/queryPageWork")
    public PageInfo<Workergroup> queryAllWorkerGroupTogglePage(int page, String name) {
	return abiz.queryAllWorkerGroup(page, 4, name);
    }

    // 查询所有班组和技工星级
    @GetMapping("/queryWork")
    public List<Workergroup> queryAllWorkerGroup() {
	return wbiz.queryAll();
    }
    
    //查询所有技工信息VO
    @GetMapping("/queryAllPreson")
    public List<workerVo> queryAllPreson() {
	return agbiz.queryPreson();
    }
    
    //查询所有班组信息
    @GetMapping("/queryALlPrsGroup")
    public List<Workergroup> queryALlPrsGroup() {
	return wbiz.queryAllPrsGroup();
    }

    // 查询所有商品并分页
    @GetMapping("/queryAllGoods")
    public PageInfo<Goods> queryAllGoods(int page, String name, String type) {
	return gbiz.queryAll(page, 10, name, type);
    }

    // 查询所有的商品类型
    @GetMapping("/queryAllGoodsItem")
    public List<Serviceitem> queryAllGoodsItem() {
	return gibiz.queryAll();
    }

    // 查询所有的商品类型并分页
    @GetMapping("/queryAllGoodsItemPage")
    public PageInfo<Serviceitem> queryAllGoodsItemPage(int page, String name) {
	return gibiz.queryAllByPage(page, 10, name);
    }

    // 根据商品类型查询商品
    @GetMapping("/queryAllGoodsByType")
    public List<Goods> queryAllGoodsByType(String typeid) {
	return gbiz.queryByTypeId(typeid);
    }

    // 查询维修订单并分页
    @GetMapping("/queryAllServicePage")
    public PageInfo<serviceVo> queryAllServicePage(int page, String wcarid, Integer wstatic) {
	System.out.println(page + "/" + wcarid + "/" + wstatic);
	return sbiz.queryServiceInfo(page, 4, wcarid, wstatic);
    }

    // 查询所有维修状态
    @GetMapping("/queryAllServiceStatus")
    public List<Statucs> queryAllServiceStatus() {
	return stbiz.queryAll();
    }

    // 查询最大的维修单号
    @GetMapping("/queryMaxWid")
    public Long queryMaxWid() {
	return sbiz.queryMaxId() + 1;
    }
    
    //查询所以未出车的车辆
    @GetMapping("/queryAllNotOutCar")
    public List<Legwork> queryAllNotOutCar() {
	return lbiz.queryAllNotOut();
    }

    //查询所有客户信息
    @GetMapping("/queryAllprs")
    public List<Customer> queryAllprs() {
	return cbiz.queryAll();
    }
    
    //根据客户编号查询客户所有车辆信息
    @GetMapping("/queryAllByPrsId")
    public List<Customercar> queryAllByPrsId(String id) {
	return ccbiz.queryByPrsId(id);
    }
    
    // 添加技工星级
    @PostMapping("/insertewgroup")
    public String insertEmpWorkerGroup(@RequestBody Workergroup entity) {
	if (wbiz.insertWorkerGroup(entity) > 0) {
	    return "ok";
	}
	return "no";
    }

    // 添加维修项目
    @PostMapping("/insertGoodsItem")
    public String insertGoodsItem(@RequestBody Serviceitem entity) {
	if (gibiz.insertGoodsItem(entity) > 0) {
	    return "ok";
	}
	return "no";
    }

    // 添加维修订单
    @PostMapping("/insertService")
    public String insertService(@RequestBody Service entity) {
	if (sbiz.insertService(entity) > 0) {
	    return "ok";
	}
	return "no";
    }

    // 添加维修订单详表
    @PostMapping("/insertServiceInfo")
    public String insertServiceInfo(@RequestBody Servicedetailed[] entity) {
	boolean iftrue = false;
	for (Servicedetailed temp : entity) {
	    if (sibiz.insertServiceInfo(temp) > 0) {
		iftrue = true;
	    }else {
		iftrue = false;
	    }
	}
	if(iftrue) {
	    return "ok";
	}
	return "no";
    }

    //添加顾客信息及车辆
    @PostMapping("/insertCustomerAndCar")
    public String insertCustomerAndCar(@RequestBody customerVo temp) {
    	temp.setTime(new Date());
	if (cbiz.InsertCustomerAndCar(temp)>0) {
	    return "ok";
	}
	return "no";
    }
    
    //添加顾客车辆
    @PostMapping("/insertCustomerCar")
    public String insertCustomerCar(@RequestBody Customercar[] entity) {
	String msg = "ok";
	for (Customercar temp : entity) {
	    if(ccbiz.insertCustomerCar(temp)<0) {
		msg = "no";
	    }
	}
	return msg;
    }
    
    // 删除技工/班组星级
    @DeleteMapping("/deleteewgroup")
    public String deleteEmpWorkerGroup(Integer id) {
	if (wbiz.deleteWorkerGroup(id) > 0) {
	    return "ok";
	}
	return "no";
    }

    // 删除维修项目
    @DeleteMapping("/deleteGoodsItem")
    public String deleteGoodsItem(int id) {
	if (gibiz.deleteGoodsItem(id) > 0) {
	    return "ok";
	}
	return "no";
    }

    // 修改技工星级
    @PutMapping("/updateewgroup")
    public String updateEmpWorkerGroup(@RequestBody Workergroup entity) {
	System.out.println(JSON.toJSONString(entity));
	if (wbiz.updateWorkerGroup(entity) > 0) {
	    return "ok";
	}
	return "no";
    }

    // 修改维修项目
    @PutMapping("/updateGoodsItem")
    public String updateGoodsItem(@RequestBody Serviceitem entity) {
	if (gibiz.updateGoodsItem(entity) > 0) {
	    return "ok";
	}
	return "no";
    }

    // 修改技工星级
    @PostMapping("/updatepreson")
    public String updatePresonWorker(String pid, int bzid) {
	Personnel tempUser = new Personnel();
	tempUser.setPid(pid);
	tempUser.setBzid(bzid);
	if (agbiz.updatePreson(tempUser) > 0) {
	    return "ok";
	}
	return "no";
    }

    // 修改商品信息
    @PostMapping("/updateGoods")
    public String updateGoods(@RequestBody Goods entity) {
	System.out.println(JSON.toJSONString(entity));
	if (gbiz.updateGoods(entity) > 0) {
	    return "ok";
	}
	return "no";
    }

    //修改车辆状态
    @PostMapping("/updateCarState")
    public String updateCarState(@RequestBody Legwork entity) {
	if(lbiz.updateCarState(entity) > 0) {
	    return "ok";
	}
	return "no";
    }
    
    // 添加工作组
    @PostMapping("/addworker")
    public String insertWorker(@RequestBody Workergroup entity) {
	if (wbiz.insertWorkerGroup(entity) > 0) {
	    return "ok";
	}
	return "no";
    }
}

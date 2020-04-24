package com.accp.vo.lc;

import java.util.Date;
import java.util.List;

import com.accp.pojo.Supplier;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

//主详查询商品表和供货商表ghsId

@TableName("goods")
public class lcGoodsVo {
	@TableId(value = "gid",type = IdType.AUTO)
	 private Integer gid;

	    private Integer ghsid;

	    private String gname;

	    private Date gtime;

	    private Float gprice;

	    private String gbrand;

	    private String gsuitable;

	    private String gtype;

	    private String gdescribe;

	    private Integer gnumber;
	    
	    private lcSupplierVo lcSupplier;

		public Integer getGid() {
			return gid;
		}

		public void setGid(Integer gid) {
			this.gid = gid;
		}

		public Integer getGhsid() {
			return ghsid;
		}

		public void setGhsid(Integer ghsid) {
			this.ghsid = ghsid;
		}

		public String getGname() {
			return gname;
		}

		public void setGname(String gname) {
			this.gname = gname;
		}

		public Date getGtime() {
			return gtime;
		}

		public void setGtime(Date gtime) {
			this.gtime = gtime;
		}

		public Float getGprice() {
			return gprice;
		}

		public void setGprice(Float gprice) {
			this.gprice = gprice;
		}

		public String getGbrand() {
			return gbrand;
		}

		public void setGbrand(String gbrand) {
			this.gbrand = gbrand;
		}

		public String getGsuitable() {
			return gsuitable;
		}

		public void setGsuitable(String gsuitable) {
			this.gsuitable = gsuitable;
		}

		public String getGtype() {
			return gtype;
		}

		public void setGtype(String gtype) {
			this.gtype = gtype;
		}

		public String getGdescribe() {
			return gdescribe;
		}

		public void setGdescribe(String gdescribe) {
			this.gdescribe = gdescribe;
		}

		public Integer getGnumber() {
			return gnumber;
		}

		public void setGnumber(Integer gnumber) {
			this.gnumber = gnumber;
		}

		public lcSupplierVo getLcSupplier() {
			return lcSupplier;
		}

		public void setLcSupplier(lcSupplierVo lcSupplier) {
			this.lcSupplier = lcSupplier;
		}


		

	
	    
	    
		
		

		
	    
	    
	    

}

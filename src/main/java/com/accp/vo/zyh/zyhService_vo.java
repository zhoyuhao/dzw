package com.accp.vo.zyh;

import java.util.List;

import com.accp.pojo.Service;
import com.accp.pojo.Servicedetailed;

public class zyhService_vo extends Service{
			
			private String bzname;
			
			private Integer type;
			
			private Integer hmoney;
			
			private String statucname;
			
			private List<Servicedetailed> list;
			
			public String getBzname() {
				return bzname;
			}
			public void setBzname(String bzname) {
				this.bzname = bzname;
			}
			public Integer getType() {
				return type;
			}
			public void setType(Integer type) {
				this.type = type;
			}
			public Integer getHmoney() {
				return hmoney;
			}
			public void setHmoney(Integer hmoney) {
				this.hmoney = hmoney;
			}
			public String getStatucname() {
				return statucname;
			}
			public void setStatucname(String statucname) {
				this.statucname = statucname;
			}
			public List<Servicedetailed> getList() {
				return list;
			}
			public void setList(List<Servicedetailed> list) {
				this.list = list;
			}
			
}

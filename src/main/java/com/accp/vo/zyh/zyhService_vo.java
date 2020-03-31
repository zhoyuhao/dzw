package com.accp.vo.zyh;

import java.util.List;

import com.accp.pojo.Service;
import com.accp.pojo.Servicedetailed;

public class zyhService_vo extends Service{
			private String statucname;
			private List<Servicedetailed> list;
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

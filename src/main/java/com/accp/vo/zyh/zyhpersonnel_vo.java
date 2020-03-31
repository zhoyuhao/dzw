package com.accp.vo.zyh;

import java.util.List;

import com.accp.pojo.Function;
import com.accp.pojo.Personnel;

public class zyhpersonnel_vo extends Personnel{
			private String juesename;
			private String gangwei;
			private List<Function> list;
			
			public String getGangwei() {
				return gangwei;
			}
			public void setGangwei(String gangwei) {
				this.gangwei = gangwei;
			}
			public String getJuesename() {
				return juesename;
			}
			public void setJuesename(String juesename) {
				this.juesename = juesename;
			}
			public List<Function> getList() {
				return list;
			}
			public void setList(List<Function> list) {
				this.list = list;
			}
			
			
}

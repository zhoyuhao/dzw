package com.accp.vo.zyh;

import java.util.List;

import com.accp.pojo.Function;
import com.accp.pojo.Role;

public class zyhRole_vo extends Role{
		
		private List<Integer> list;

		private List<zyhpersonnel_vo> userlist;
		
		
		public List<zyhpersonnel_vo> getUserlist() {
			return userlist;
		}

		public void setUserlist(List<zyhpersonnel_vo> userlist) {
			this.userlist = userlist;
		}

		public List<Integer> getList() {
			return list;
		}

		public void setList(List<Integer> list) {
			this.list = list;
		}
		
}

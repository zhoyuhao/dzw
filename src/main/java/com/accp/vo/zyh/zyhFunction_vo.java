package com.accp.vo.zyh;

import java.util.List;

import com.accp.pojo.Function;

public class zyhFunction_vo extends Function{
		
		private String  label;
		
		private List<Function> children;

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public List<Function> getChildren() {
			return children;
		}

		public void setChildren(List<Function> children) {
			this.children = children;
		}

		
		
}

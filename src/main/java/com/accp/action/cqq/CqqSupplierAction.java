package com.accp.action.cqq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.cqq.CqqSupplierBiz;
import com.accp.pojo.Supplier;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("CqqSupplierAction/api")
public class CqqSupplierAction {

	@Autowired
	private CqqSupplierBiz cqqSupplierBiz;

	@GetMapping("{n}/{s}")
	public PageInfo<Supplier> selectSupplierList(@PathVariable Integer n, @PathVariable Integer s) {
		System.out.println("供货单位管理");
		return cqqSupplierBiz.selectSupplierList(n, s);
	}

	@DeleteMapping("{id}")
	public int supplierDelete(@PathVariable Integer id) {
		System.out.println("供货单位id：" + id);
		return cqqSupplierBiz.supplierDelete(id);
	}

	@PostMapping("add")
	public int supplierAdd(@RequestBody Supplier supplier) {
		System.out.println("供货单位add");
		return cqqSupplierBiz.supplierAdd(supplier);
	}

	@GetMapping("{id}")
	public Supplier selectSupplierPojo(@PathVariable Integer id) {
		System.out.println("供货单位select");
		return cqqSupplierBiz.selectSupplierPojo(id);
	}

	@PostMapping("update")
	public int supplierUpdate(@RequestBody Supplier supplier) {
		System.out.println("供货单位update");
		return cqqSupplierBiz.supplierUpdate(supplier);
	}

}

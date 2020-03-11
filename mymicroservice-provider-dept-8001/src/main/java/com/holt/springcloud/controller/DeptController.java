package com.holt.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.holt.spirngcloud.entities.Dept;
import com.holt.springcloud.service.DeptService;

/**
 * @author ：hot
 * @date :2020年3月11日 
 * @version： 
 * Dept部门控制器使用了restful风格
 */
@RestController
public class DeptController {
//注入入DeptService
	@Autowired
	private DeptService service;

	@RequestMapping(value = "/dept", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return service.add(dept);
	}

	@RequestMapping(value = "/dept/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return service.get(id);
	}

	@RequestMapping(value = "/depts", method = RequestMethod.GET)
	public List list() {
		return service.list();
	}
}

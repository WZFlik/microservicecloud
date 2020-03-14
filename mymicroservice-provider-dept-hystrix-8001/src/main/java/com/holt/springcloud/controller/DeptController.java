package com.holt.springcloud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.holt.spirngcloud.entities.Dept;
import com.holt.spirngcloud.feignservice.DeptFeignService;
import com.holt.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author ：hot
 * @date :2020年3月11日 @version： Dept部门控制器使用了restful风格
 */
@RestController
public class DeptController {
//注入入DeptService
	@Autowired
	private DeptService service;

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return service.add(dept);

	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(@PathVariable("id") Long id) {
		Dept dept = service.get(id);
		if (dept == null) {
			
			throw new RuntimeException("该ID****" + id + "没有对应的信息。");
			
		}

		return dept;
	}

	@HystrixCommand(fallbackMethod = "processHystrix_LIST")
	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List list() {
		return service.list();
	}

	/**
	 * @HystrixCommand标注方法出现故障时调用
	 * @param id
	 * @return dept
	 */
	public Dept processHystrix_Get(@PathVariable("id") Long id) {
		return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
				.setDbSource("no this database in MySQL");
	}
	
	public List<Dept> processHystrix_LIST() {
		List<Dept> list = new ArrayList();
		
		Dept dept =  new Dept().setDeptno(0L).setDname("该ID：" + 0L + "没有没有对应的信息,null--@HystrixCommand_list")
				.setDbSource("no this database in MySQL");
		list.add(dept);
		return list;
	}
	
}

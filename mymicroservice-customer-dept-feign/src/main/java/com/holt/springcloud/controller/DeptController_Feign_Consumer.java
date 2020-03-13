package com.holt.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.holt.spirngcloud.entities.Dept;
import com.holt.spirngcloud.feignservice.DeptFeignService;

/**
 * @author hot
 * @since 2020年3月11日
 * @version 对外暴漏的消费者的controller层
 */
@RestController
public class DeptController_Feign_Consumer {

	@Autowired
	private DeptFeignService feignService;

	@RequestMapping("/consumer/dept/add")
	public Boolean addDept(Dept dept) {
		return feignService.add(dept);
	}

	/**
	 * 根据id获取Dept
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/consumer/dept/get/{id}")
	public Dept getDept(@PathVariable(value = "id") Long id) {
		return feignService.get(id);

	}

	@SuppressWarnings("unchecked")

	@GetMapping("/consumer/dept/list")
	public List<Dept> getList() {
		System.out.println("*********Feign---list");
		return feignService.list();

	}

	/*
	 * @SuppressWarnings("unchecked")
	 * 
	 * @GetMapping("/consumer/dept/list") public String getList() {
	 * System.out.println("*********Feign---list"); return "jjjj";
	 * 
	 * }
	 */

}

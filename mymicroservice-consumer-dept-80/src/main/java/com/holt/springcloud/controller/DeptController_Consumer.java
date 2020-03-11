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

/**
 *@author hot
 *@since 2020年3月11日
 *@version     
 * 对外暴漏的消费者的controller层
 */
@RestController
public class DeptController_Consumer {
	//url前缀
	//TODO
	private final String PREFIX = "http://localhost:8001";
	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * 使用restTeplate 连接DeptController的url
	 * @param dept
	 * @return
	 */
	@RequestMapping("/consumer/dept/add")
	public Boolean addDept(Dept dept) {
		return restTemplate.postForObject(PREFIX+"/dept/add", dept, Boolean.class);
	}
	
	/**
	 *  根据id获取Dept
	 * @param id
	 * @return
	 */
	@GetMapping("/consumer/dept/get/{id}")
	public Dept getDept(@PathVariable(value = "id") Long id) {
		return restTemplate.getForObject(PREFIX+"/dept/get/"+id, Dept.class);
	}
	
	
	@SuppressWarnings("unchecked")
	@GetMapping("/consumer/dept/list")
	public List<Dept> getDept() {
		return restTemplate.getForObject(PREFIX+"/dept/list", List.class);
	}

}

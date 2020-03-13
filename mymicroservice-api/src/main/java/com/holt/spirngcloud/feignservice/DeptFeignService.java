package com.holt.spirngcloud.feignservice;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.holt.spirngcloud.entities.Dept;

/**
 *@author hot
 *@since 2020年3月13日
 *@version     
 *
 */
@FeignClient("mymicroservicecloud-dept")
public interface DeptFeignService {

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept);
		

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) ;

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() ;
}

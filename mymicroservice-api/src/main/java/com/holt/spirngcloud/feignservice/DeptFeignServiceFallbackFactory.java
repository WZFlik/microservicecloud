package com.holt.spirngcloud.feignservice;

import java.util.List;

import org.springframework.stereotype.Component;

import com.holt.spirngcloud.entities.Dept;
import com.holt.spirngcloud.feignservice.DeptFeignService;

import feign.hystrix.FallbackFactory;

/**
 *@author hot
 *@since 2020年3月13日
 *@version 
 *为DeptFeignService设置熔断机制    
 *
 */
@Component
public class DeptFeignServiceFallbackFactory implements FallbackFactory<DeptFeignService>{

	@Override
	public DeptFeignService create(Throwable cause) {
		return new DeptFeignService() {
			
			@Override
			public List<Dept> list() {
				return null;
			}
			
			@Override
			public Dept get(Long id) {
				return new Dept().setDeptno(id).setDname("该ID：" + id + "已开启降级,null--@HystrixCommand")
				.setDbSource("no this database in MySQL");
			}
			
			@Override
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
	}

}

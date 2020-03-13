package com.holt.springcloud.cfgbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 *@author hot
 *@since 2020年3月11日
 *@version     
  * consumer的配置类
 */
@Configuration
public class ConfigBean {
	/***
	 * 将restTeplate 加入容器
	 * @return
	 */
	@Bean
	@LoadBalanced  //开启Ribbon负载均衡
	public RestTemplate restTeplate() {
		return new RestTemplate();
	}
	
	/**
	 * 自定义随机负载算法
	 * 覆盖默认的轮询算法
	 */
//	@Bean
//	public IRule myRule() {
//		return new RandomRule();
//	}

}

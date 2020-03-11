package com.holt.springcloud.cfgbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

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
	public RestTemplate restTeplate() {
		return new RestTemplate();
	}

}

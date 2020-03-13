package com.holt.springcloud.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

/**
 *@author hot
 *@since 2020年3月11日
 *@version     
 *
 */
@Configuration
public class DruidConfig {
	
	@ConfigurationProperties(prefix = "spring.datasource")
	@Bean
	public DataSource druidDatasource(){
		
		return new DruidDataSource();
	}

}

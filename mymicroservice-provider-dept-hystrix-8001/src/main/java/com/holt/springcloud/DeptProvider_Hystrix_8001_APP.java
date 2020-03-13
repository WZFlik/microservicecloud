package com.holt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 *@author hot
 *@since 2020年3月11日
 *@version     
 *this is run APP
 */
@SpringBootApplication
@EnableEurekaClient  //zureka的客户端
@EnableCircuitBreaker//开启服务熔断
public class DeptProvider_Hystrix_8001_APP {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider_Hystrix_8001_APP.class, args);
	}

}

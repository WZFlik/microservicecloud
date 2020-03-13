package com.holt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 *@author hot
 *@since 2020年3月11日
 *@version     
 *对外暴漏的消费者的启动类
 */
@SpringBootApplication
@EnableEurekaClient        //eureka客户端
@EnableFeignClients(basePackages = {"com.holt.spirngcloud.feignservice"})
@ComponentScan(basePackages = {"com.holt.spirngcloud.feignservice","com.holt.springcloud.controller"})
public class DeptConsumer_feign_APP {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_feign_APP.class, args);
	}

}

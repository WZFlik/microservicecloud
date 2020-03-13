package com.holt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.holt.ribboncfg.RuleConfig;

/**
 *@author hot
 *@since 2020年3月11日
 *@version     
 *对外暴漏的消费者的启动类
 */
@SpringBootApplication
@EnableEurekaClient        //eureka客户端
//在访问mymicroservicecloud-dept时自定义了RuleConfig规则类
@RibbonClient(value = "mymicroservicecloud-dept",configuration = RuleConfig.class)
public class DeptConsumer80_APP {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_APP.class, args);
	}

}

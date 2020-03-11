package com.holt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *@author hot
 *@since 2020年3月11日
 *@version     
 *对外暴漏的消费者的启动类
 */
@SpringBootApplication
public class DeptConsumer80_APP {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_APP.class, args);
	}

}

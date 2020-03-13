package com.holt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *@author hot
 *@since 2020年3月11日
 *@version     
 *this is run APP
 */
@SpringBootApplication
@EnableEurekaClient  //zureka的客户端
public class DeptProvider8002_APP {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8002_APP.class, args);
	}

}

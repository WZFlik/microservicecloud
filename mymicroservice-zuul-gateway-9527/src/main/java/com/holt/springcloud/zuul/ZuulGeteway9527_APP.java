package com.holt.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 *@author hot
 *@date 2020年3月11日
 *@version     
 *this is run APP
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient  //zureka的客户端
public class ZuulGeteway9527_APP {
	public static void main(String[] args) {
		SpringApplication.run(ZuulGeteway9527_APP.class, args);
	}

}

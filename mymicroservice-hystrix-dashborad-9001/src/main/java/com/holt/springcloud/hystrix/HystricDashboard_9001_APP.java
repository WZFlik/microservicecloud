package com.holt.springcloud.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**  

* <p>Title: HystricDashboard_9001_APP.java</p>  
* <p>Description: </p>  
* @author hot  
* @date 2020年3月13日  
* @version 1.0  
*/
@EnableHystrixDashboard
@SpringBootApplication
public class HystricDashboard_9001_APP {
	public static void main(String[] args) {
		SpringApplication.run(HystricDashboard_9001_APP.class, args);
	}

}


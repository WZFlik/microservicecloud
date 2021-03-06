package com.holt.springcloud.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *@author hot
 *@since 2020年3月12日
 *@version     
 * eureka服务启动类
 */

@SpringBootApplication
@EnableEurekaServer//EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7001_APP
{
public static void main(String[] args){
   SpringApplication.run(EurekaServer7001_APP.class, args);
  }
}

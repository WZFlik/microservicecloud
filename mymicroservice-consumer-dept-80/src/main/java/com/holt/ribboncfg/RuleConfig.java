package com.holt.ribboncfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

/**
 *@author hot
 *@since 2020年3月13日
 *@version     
 *该配置类所在包不能在主程序的包和子包下
 */
@Configuration
public class RuleConfig  {
	@Bean 
	public IRule myNRule() {
		
		return new RoundRobinRule();
	}
	

}

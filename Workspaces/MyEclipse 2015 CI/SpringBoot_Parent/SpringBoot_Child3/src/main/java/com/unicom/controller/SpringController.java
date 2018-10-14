package com.unicom.controller;

import java.nio.charset.Charset;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class SpringController {
	
	//@Bean 这个注解可以被 spring boot 自动加载到容器中
	
	
	//定义消息转化器
	@Bean
	public StringHttpMessageConverter stringHttpMessageConverter(){
		
		StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
	    return converter;
	
	}
	
	@RequestMapping("/hello")
	public String hello(){
		return "hello,你好！";
	}
	
}

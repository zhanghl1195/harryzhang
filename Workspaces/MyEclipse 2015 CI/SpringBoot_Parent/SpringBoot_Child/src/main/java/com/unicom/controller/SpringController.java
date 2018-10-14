package com.unicom.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
@EnableAutoConfiguration
public class SpringController {
	
	//private Logger logger = LoggerFactory.getLogger(SpringController.class);
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/hello")
	//如果内容是Restful内容，不写responseBody会进行跳转
	//@ResponseBody
	public String hello(){
		return "hello";	
	}
	
	@RequestMapping("/hehe")
	//@ResponseBody
	public String hehe(){
		return "hehe";
		
	}
	
	//@PathVariable 把{msg}接收到的参数赋值给前台
	@RequestMapping("/show/{msg}")
	public String show(@PathVariable String msg){
		return "msg: " + msg;
	}
	
	@RequestMapping("/testlog")
	public String testlog(){
		
	    logger.debug("debug日志");
	    logger.info("info日志");
	    logger.warn("warn日志");
	    logger.error("error日志");
		return "testlog";
	}
	
}

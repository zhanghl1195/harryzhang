package com.unicom.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//默认情况:会自动扫描当前包以及当前包下的子包
//@EnableAutoConfiguration
//@ComponentScan("com.unicom.controller")   //扫描某个包
//组合注解
@SpringBootApplication(scanBasePackages={"com.unicom.controller"})
public class SpringApp {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringApp.class, args);
	}
}

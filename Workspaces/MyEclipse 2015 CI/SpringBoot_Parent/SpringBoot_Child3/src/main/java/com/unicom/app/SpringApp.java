package com.unicom.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


//默认情况:会自动扫描当前包以及当前包下的子包
//@EnableAutoConfiguration
//@ComponentScan("com.unicom.controller")   //扫描某个包
//组合注解
@SuppressWarnings("deprecation")
@SpringBootApplication(scanBasePackages={"com.unicom.controller"})
public class SpringApp extends WebMvcConfigurerAdapter{
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringApp.class, args);
	}
	
	/*@Override
	public void configureMessageConverters(
			List<HttpMessageConverter<?>> converters) {
		// 创建一个fastjson的消息转换器
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		//创建fastjson配置对象
		FastJsonConfig config = new FastJsonConfig();
		//设置fastjson config格式化
		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
		converter.setFastJsonConfig(config);
		
		converters.add(converter);
	}*/
	
	/*@Bean
	public HttpMessageConverters fastjsonMessageConverter(){
		// 创建一个fastjson的消息转换器
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		//创建fastjson配置对象
		FastJsonConfig config = new FastJsonConfig();
		//设置fastjson config格式化
		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
		converter.setFastJsonConfig(config);
		
		HttpMessageConverter<?> con = converter;
		return new HttpMessageConverters(con);
	}
*/
}

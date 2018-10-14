package com.unicom.controller;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes=SpringController.class)  //指定要测试的类
@RunWith(SpringJUnit4ClassRunner.class)          //指定实现测试的类
@WebAppConfiguration                             //和web的整合
public class SpringControllerTest {
	
	@Autowired    //自动注入要测试的类
	private SpringController springController;

	@Test
	public void testHello() {
		//使用断言进行测试
		TestCase.assertEquals(this.springController.hello(), "hello");
	}

}

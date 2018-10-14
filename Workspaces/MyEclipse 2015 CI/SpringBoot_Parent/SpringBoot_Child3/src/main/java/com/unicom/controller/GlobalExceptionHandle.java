package com.unicom.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandle {
    //定义全局异常处理器
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Map<String, Object> allExceptionHandler(Exception exception){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("errcode", "500");
		map.put("errmsg", exception.toString());
		
		return map;
	}
	
}

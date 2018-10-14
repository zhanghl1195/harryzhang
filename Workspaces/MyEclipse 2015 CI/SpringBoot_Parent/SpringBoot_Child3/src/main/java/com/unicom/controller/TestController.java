package com.unicom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    
	@RequestMapping("/index")
	public String show2(Model model){
		
		model.addAttribute("username","张三");
		return "index";
	}
	//  /jsp/index.jsp  前缀/jsp/ 后缀.jsp
	
}

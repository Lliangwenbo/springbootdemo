package com.feeling.apollo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@RequestMapping("/test")
	@ResponseBody
	public void syso() {
		
		System.out.println("调用成功！！！！！！");
		
	}

}

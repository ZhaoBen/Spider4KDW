package com.spider.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class SpringMVCTest {
	
	@RequestMapping("/hello")
	public String helloSpider(){
		return "hello";
	}
	
}

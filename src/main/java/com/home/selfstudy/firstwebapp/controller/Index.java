package com.home.selfstudy.firstwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Index {

	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@ResponseBody
	@GetMapping("/test")
	public String test() {
		return "Huy";
	}
}

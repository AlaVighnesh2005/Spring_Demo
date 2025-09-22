package com.vvit.springboot_web_data_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import springboot_web_data_app.src.main.java.model.User;

@Controller
public class HomeController {

	//localhost:1818/ -- Registration form
	
	@GetMapping("/")  //getmapping is used when user sends a request without data
	public String before_reg()
	{
		return "register.jsp";
	}
	
	@PostMapping("/register")
	public String after_reg(User user)
	{
		return "login";
	}
	
}

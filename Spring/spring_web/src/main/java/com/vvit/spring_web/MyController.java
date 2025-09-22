package com.vvit.spring_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.ui.Model;



@SpringBootApplication

@Controller
public class MyController {
	
	//localhost:8080/greet
	
	@GetMapping("/hello")
	public String hello()
	{
		return "greet";
	}
	@GetMapping("/")
	
	public String form()
	{
		return "form";
	}
	
	
	//handling action in form.jsp localhost:4545/welcome
	
	@PostMapping("/greet")
	
//	public String welcome(String uname) // 1st way without using model
//	{
//		return "greet";
//	}
	
	public String welcome(String uname, Model model) // 2nd way using model class
	{
		model.addAttribute("id",uname);
		return "greet";
	}
	
	
//	public String greet(User user)  //3rd way using class
//	{
//		return "greet";
//	}
}

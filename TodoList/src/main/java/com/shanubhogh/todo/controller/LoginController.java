package com.shanubhogh.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String loginMessage(){
		return "Hello World";
	}
	
	@RequestMapping("/logintest")
	public String login()
	{
		return "Welcome narayana Shanubhogh";
	}
}

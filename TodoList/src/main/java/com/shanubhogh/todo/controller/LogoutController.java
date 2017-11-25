package com.shanubhogh.todo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LogoutController {
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String Logout(HttpServletRequest request,HttpServletResponse response) {
		Authentication autentication=SecurityContextHolder.getContext().getAuthentication();
		if(autentication !=null)
		{
			new SecurityContextLogoutHandler().logout(request, response,
					autentication);
		}
		
		return "redirect:/";
	}

}

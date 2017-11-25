package com.shanubhogh.todo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller("error")
public class ErrorController {

	public ModelAndView handleException(HttpServletRequest request, Exception ex) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("exception", ex.getLocalizedMessage());
		mv.addObject("",request.getRequestURI());
		mv.setViewName("error");
		return mv;
	}
	
}

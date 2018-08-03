package com.nucleus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class SecurityController 
{
	@RequestMapping("/accdenied")
	public String requestHandler1()
	{
		return "accessdenied";
	}
	
	
	@RequestMapping("/login")
	public String requestHandler2()
	{
		return "login";
	}
	
	
	@RequestMapping("/loginfailure")
	public ModelAndView requestHandler3()
	{
		return new ModelAndView("login" , "error" , "Wrong credentials");
	}
	

}

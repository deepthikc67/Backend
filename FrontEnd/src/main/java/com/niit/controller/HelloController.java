package com.niit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class HelloController {
	

	 
	   @RequestMapping(value = "/hello", method = RequestMethod.GET)
	   public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring");
	      return "login";
	   }
	   
	   
	   @RequestMapping(value = "/check", method = RequestMethod.GET)
	   public String printHello2() {
	      return "home";
	   }
	   
	   
	   @RequestMapping(value = "/register", method = RequestMethod.GET)
	   public String register() {
	      return "register";

	}
}



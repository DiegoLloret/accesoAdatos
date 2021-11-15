package com.eep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/base")
public class HelloWorldController {
	
	@GetMapping("/holamundo")
	public String helloWorld() {
		return "helloworld";
	}
	@RequestMapping(value="/holamundomav", method=RequestMethod.GET)
	public ModelAndView helloworldMAV() {
		return new ModelAndView("helloworld");
	}
}

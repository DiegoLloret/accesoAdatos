package com.eep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ejemplos")
public class EjemploPasoValorController {
	final String plantillaPasoValor="ejemplopasovalor";
	@GetMapping("/ejemplo1")
	public String helloWorld(Model model) {
		model.addAttribute("persona","juan");
		return plantillaPasoValor;
	}
	@RequestMapping(value="/ejemplo1mav", method=RequestMethod.GET)
	public ModelAndView helloworldMAV() {
		
	ModelAndView mav= new ModelAndView(plantillaPasoValor);
	mav.addObject("persona","pepe");
	return mav;
	}
}

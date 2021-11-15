package com.eep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eep.model.Persona;

@Controller
@RequestMapping("/ejemplos")
public class EjemploPasoValorComplejoController {
	final String plantillaPasoValor="ejemplopasovalorcomplejo";
	@GetMapping("/ejemplo2")
	public String helloWorld(Model model) {
		Persona p1= new Persona();
		p1.setEdad(20);
		p1.setNombre("juan");
		model.addAttribute("persona",p1);
		return plantillaPasoValor;
	}
	@RequestMapping(value="/ejemplo2mav", method=RequestMethod.GET)
	public ModelAndView helloworldMAV() {
		Persona p1= new Persona();
		p1.setEdad(60);
		p1.setNombre("pepe");
	ModelAndView mav= new ModelAndView(plantillaPasoValor);
	mav.addObject("persona",p1);
	return mav;
	}
}

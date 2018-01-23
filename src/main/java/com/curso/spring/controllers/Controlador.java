package com.curso.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="/saludo")
public class Controlador {
	@RequestMapping(path="/bienvenida", method=RequestMethod.GET)
	public String bienvenida() {
		return nu
	}
	
	@RequestMapping(path="/despedida", method=RequestMethod.GET)
	public String despedida() {
		
	}

}

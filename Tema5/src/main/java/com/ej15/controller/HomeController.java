package com.ej15.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("mensaje", "Bienvenido a Thymeleaf");
		model.addAttribute("nombre1", "Andrés Avelino García Romero");
		model.addAttribute("nombre2", "<b> Andrés Avelino García Romero </b>");
		model.addAttribute("imagen", "/imagenes/pizza.jpg");
		return "home";
	}
		
}

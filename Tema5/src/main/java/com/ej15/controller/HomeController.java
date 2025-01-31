package com.ej15.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ej15.model.User;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("mensaje", "Bienvenido a Thymeleaf");
		model.addAttribute("nombre1", "Andrés Avelino García Romero");
		model.addAttribute("nombre2", "<b> Andrés Avelino García Romero </b>");
		model.addAttribute("imagen", "/imagenes/pizza.jpg");
		model.addAttribute("role", "admin");
		
		List<String> personas = new ArrayList<>();
		personas.add("Belen");
		personas.add("Andres");
		personas.add("Tay");
		personas.add("Laura");
		personas.add("Vega");
		model.addAttribute("persona", personas);
		
		model.addAttribute("submit", "/form");
		return "home";
	}
		
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/form")
	public String form(Model model) {
			model.addAttribute("user", new User());
		return "form";
	}
	

	@PostMapping("/guardar")
	public String guardar(@ModelAttribute User user, Model model) {
		model.addAttribute("user", user);
		return "result";
	}
}

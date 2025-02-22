package com.ej15.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ej15.model.Usuario;
import com.ej15.service.UsuarioService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService service;

	@GetMapping("/")
	public String index(){
		return "index";
	}
	
	@GetMapping("/usuarios")
	public String usuarios(Model model) {
		List<Usuario> lista = service.getAllUsuarios();
		model.addAttribute("listaUsuarios", lista);
		
		return "usuarios";
	}
	
	@GetMapping("/usuario-form")
	public String usuarioForm(Model model) {
		model.addAttribute("", "");
		return "usuario-form";
		
	}
	
}

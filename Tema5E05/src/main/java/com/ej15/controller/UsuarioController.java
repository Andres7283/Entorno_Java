package com.ej15.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ej15.model.Usuario;
import com.ej15.service.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@GetMapping("/")
	public String getAllUsuarios(Model model){
		List<Usuario> lista = service.getAllUsuarios();
		model.addAttribute("listaUsuarios", lista);
		
		return "usuarios";
	}
}

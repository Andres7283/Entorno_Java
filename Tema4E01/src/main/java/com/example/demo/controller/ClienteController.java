package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Cliente;
import com.example.demo.servicio.ClienteServicio;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	

	@Autowired
	private ClienteServicio service;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> obtenerClientes(){
		List<Cliente> clientes = service.obtenerClientes();
		return ResponseEntity.ok(clientes);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> obtenerClientePorId(@PathVariable int id){
		 Cliente cliente = service.obtenerClientePorId(id);	
		 
		 return ResponseEntity.ok(cliente);
	}
	
	@PostMapping
	public ResponseEntity<Void> postCliente(@RequestBody Cliente clienteAñadido){
		service.postCliente(clienteAñadido);
		return ResponseEntity.noContent().build();
	}
}

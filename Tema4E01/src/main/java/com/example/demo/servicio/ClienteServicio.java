package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.repository.ClienteRepository;

import jakarta.transaction.Transactional;

@Service
public class ClienteServicio {
	
	@Autowired
	private ClienteRepository repository;

	public List<Cliente> obtenerClientes() {
		return repository.obtenerClienetes();
	}

	public Cliente obtenerClientePorId(int id) {
		return repository.obtenerClienetesPorId(id);
	}
	
	@Transactional
	public void postCliente(Cliente clienteAñadido) {
		repository.postCliente(clienteAñadido);
	}
	

}



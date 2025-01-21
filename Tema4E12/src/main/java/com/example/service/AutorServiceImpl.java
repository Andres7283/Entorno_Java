package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.modelo.Autor;
import com.example.repository.AutorRepositoryImpl;

@Service
public class AutorServiceImpl  implements AutorService{

	@Autowired
	private AutorRepositoryImpl autor;
	
	@Override
	public List<Autor> getListaAutores(){
		return autor.getListaAutores();
	}
	
	@Override
	public Autor getAutorPorId(int id) {
		return autor.getAutorPorId(id);
	}
}

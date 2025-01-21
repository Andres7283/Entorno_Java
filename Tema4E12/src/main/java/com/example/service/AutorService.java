package com.example.service;

import java.util.List;

import com.example.modelo.Autor;

public interface AutorService {

	List<Autor> getListaAutores();

	Autor getAutorPorId(int id);

}

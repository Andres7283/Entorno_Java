package com.example.repository;

import java.util.List;

import com.example.modelo.Autor;

public interface AutorRepository {

	List<Autor> getListaAutores();

	Autor getAutorPorId(int id);

}

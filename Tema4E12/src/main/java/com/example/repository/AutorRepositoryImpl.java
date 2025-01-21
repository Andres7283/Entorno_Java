package com.example.repository;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.example.modelo.Autor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class AutorRepositoryImpl implements AutorRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Autor> getListaAutores() {
		Query<Autor>query = (Query<Autor>) entityManager.createQuery("select a from Autor a", Autor.class);
		List<Autor> lista = query.getResultList();
		return lista;
	}

	@Override
	public Autor getAutorPorId(int id) {
		return entityManager.find(Autor.class, id);
	}
}

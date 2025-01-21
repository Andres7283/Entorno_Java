package com.ej15.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ej15.model.Curso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class CursoRepositoryImpl implements CursoRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crearCurso(Curso nuevoCurso) {
		entityManager.persist(nuevoCurso);
	}
	
	@Override
	public List<Curso> getTodosCursos() {
		return entityManager.createQuery("FROM Curso" , Curso.class).getResultList();
	}

	@Override
	public Curso getCursoPorId(int id) {
		return entityManager.find(Curso.class, id);
	}
	

}

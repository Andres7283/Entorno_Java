package com.ej15.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ej15.model.Curso;
import com.ej15.repository.CursoRepositoryImpl;

import jakarta.transaction.Transactional;

@Service
public class CursoServiceImpl implements CursoService{
	
	@Autowired
	private CursoRepositoryImpl cursoRepositoryImpl;
	
	@Override
	public void crearCurso(Curso nuevoCurso) {
		cursoRepositoryImpl.crearCurso(nuevoCurso);
	}
	
	@Override
	@Transactional
	public List<Curso> getTodosCursos(){
		return cursoRepositoryImpl.getTodosCursos();
	}
	
	@Override
	public Curso getCursoPorId(int id) {
		return cursoRepositoryImpl.getCursoPorId(id);
	}
}

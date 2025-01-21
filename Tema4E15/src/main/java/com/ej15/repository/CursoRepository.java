package com.ej15.repository;

import java.util.List;

import com.ej15.model.Curso;

public interface CursoRepository{

	void crearCurso(Curso nuevoCurso);

	List<Curso> getTodosCursos();

	Curso getCursoPorId(int id);




}

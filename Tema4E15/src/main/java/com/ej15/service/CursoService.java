package com.ej15.service;

import java.util.List;

import com.ej15.model.Curso;

public interface CursoService {


	List<Curso> getTodosCursos();

	void crearCurso(Curso nuevoCurso);

	Curso getCursoPorId(int id);

}

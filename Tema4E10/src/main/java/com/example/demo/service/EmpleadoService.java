package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Empleado;

public interface EmpleadoService {

	public Empleado createOrUpdate(Empleado empleado);

	public Empleado findById(Integer id);

	public List<Empleado> findAll();

	public List<Empleado> findByPuesto(String puesto);

	public void deleteById(Integer id);

}

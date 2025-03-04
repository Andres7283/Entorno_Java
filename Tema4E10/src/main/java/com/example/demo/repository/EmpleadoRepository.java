package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Empleado;

@Repository
public interface EmpleadoRepository {

	public Empleado save(Empleado empleado);

	public Empleado findById(Integer id);

	public List<Empleado> findAll();

	public List<Empleado> findByPuesto(String puesto);


	public void deleteById(Integer id);

	long countEmpleadosByOficinaId(Integer oficinaId);

}

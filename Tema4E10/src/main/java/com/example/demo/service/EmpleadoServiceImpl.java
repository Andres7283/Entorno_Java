package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Empleado;
import com.example.demo.repository.EmpleadoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService{

	
	@Autowired
	private EmpleadoRepository empleadoRepository;
  

    public Empleado createOrUpdate(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public Empleado findById(Integer id) {
        return empleadoRepository.findById(id);
    }

    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    public List<Empleado> findByPuesto(String puesto) {
        return empleadoRepository.findByPuesto(puesto);
    }


    public void deleteById(Integer id) {
        empleadoRepository.deleteById(id);
    }
}

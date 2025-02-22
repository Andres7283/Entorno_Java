package com.Ejr01.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Ejr01.model.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Usuario> getAllUsuario(){
		return entityManager.createQuery("FROM Usuario", Usuario.class).getResultList();
	}
	
	@Override
	public Usuario getUsuarioById(Integer id) {
		return entityManager.find(Usuario.class, id);
	}

	@Override
	public void saveUsuario(Usuario usuario) {
		entityManager.merge(usuario);
	}
}

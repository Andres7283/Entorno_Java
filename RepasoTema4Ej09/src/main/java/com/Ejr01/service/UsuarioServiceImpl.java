package com.Ejr01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ejr01.model.Usuario;
import com.Ejr01.repository.UsuarioRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepository clienteRepository;
	
	@Override
	public List<Usuario> getAllUsuario(){
		return clienteRepository.getAllUsuario();
	}
	
	@Override
	public Usuario getUsuarioById(Integer id) {
		return clienteRepository.getUsuarioById(id);
	}
	
	@Override
	public void saveUsuario(Usuario usuario) {
		clienteRepository.saveUsuario(usuario);
	}
	
	@Override
	public Boolean deleteUsuario(Integer id) {
		Usuario usuario = clienteRepository.getUsuarioById(id);
		if (usuario != null) {
			clienteRepository.deleteUsuario(usuario);
			return true;
		}
		return false;
	}
}

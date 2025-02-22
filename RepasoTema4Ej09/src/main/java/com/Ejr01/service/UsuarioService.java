package com.Ejr01.service;

import java.util.List;

import com.Ejr01.model.Usuario;

public interface UsuarioService {

	List<Usuario> getAllUsuario();

	Usuario getUsuarioById(Integer id);

	void saveUsuario(Usuario usuario);

	Boolean deleteUsuario(Integer id);

}

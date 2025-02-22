package com.Ejr01.repository;

import java.util.List;

import com.Ejr01.model.Usuario;

public interface UsuarioRepository {

	List<Usuario> getAllUsuario();

	Usuario getUsuarioById(Integer id);

	void saveUsuario(Usuario usuario);

	void deleteUsuario(Usuario usuario);





}

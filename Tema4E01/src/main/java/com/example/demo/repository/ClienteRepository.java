package com.example.demo.repository;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class ClienteRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<Cliente> obtenerClienetes() {
		Query<Cliente> query = (Query<Cliente>) entityManager.createQuery("select c from Cliente c", Cliente.class);
        List<Cliente> lista = query.getResultList();
        return lista;
	}

	public Cliente obtenerClienetesPorId(int id) {
		Cliente cliente = entityManager.find(Cliente.class, id);
		return cliente;
	}

	public void postCliente(Cliente clienteAñadido) {
		entityManager.persist(clienteAñadido);
	}

	
}

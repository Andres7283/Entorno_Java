package com.example.demo.repository;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class HotelRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	public Hotel postHotel(Hotel nuevoHotel) {
		entityManager.persist(nuevoHotel);
		return nuevoHotel;
	}

	public List<Hotel> obtenerHoteles() {
		Query<Hotel>query = (Query<Hotel>)entityManager.createQuery("select h from Hotel h", Hotel.class);
		List<Hotel> hoteles = query.getResultList();
		return hoteles;
	}

}

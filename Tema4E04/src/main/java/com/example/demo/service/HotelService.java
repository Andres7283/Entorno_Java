package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Hotel;
import com.example.demo.repository.HotelRepository;

import jakarta.transaction.Transactional;

@Service
public class HotelService {

	@Autowired
	private HotelRepository repository;

	@Transactional
	public Hotel postHotel(Hotel nuevoHotel) {
		
		return repository.postHotel(nuevoHotel);
	}

	public List<Hotel> obtenerHoteles() {
		return repository.obtenerHoteles();
	}

	public List<Hotel> obtenerHotelesEnRango(int min, int max) {
		return null;
		
		
				
	}




}

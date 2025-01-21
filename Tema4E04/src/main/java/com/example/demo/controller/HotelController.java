package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Hotel;
import com.example.demo.service.HotelService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/hoteles")
public class HotelController {
	
	@Autowired
	private HotelService service;
	
	@PostMapping
	public ResponseEntity<Void> postHotel(@RequestBody Hotel nuevoHotel) {
		service.postHotel(nuevoHotel);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> obtenerHoteles(){
		List<Hotel> hoteles = service.obtenerHoteles();
		return ResponseEntity.ok(hoteles);
	}
	
	// ********METODOS ADICIONALES**********
	
	@GetMapping("/estrellas/{min}/{max}")
	public ResponseEntity<List<Hotel>> obtenerHotelesEnRango(@PathVariable int min , @PathVariable int max){
		
		List<Hotel> rangoHoteles = service.obtenerHotelesEnRango(min , max);
		return null;
		
		
	}
	

}

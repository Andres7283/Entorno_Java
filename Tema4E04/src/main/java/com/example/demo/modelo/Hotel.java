package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nommbre;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "estrellas")
	private int estrellas;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "pagina_web")
	private String pWeb;

	public Hotel() {
		super();
	}

	public Hotel(int id, String nommbre, String direccion, int estrellas, String telefono, String pWeb) {
		super();
		this.id = id;
		this.nommbre = nommbre;
		this.direccion = direccion;
		this.estrellas = estrellas;
		this.telefono = telefono;
		this.pWeb = pWeb;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNommbre() {
		return nommbre;
	}

	public void setNommbre(String nommbre) {
		this.nommbre = nommbre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getpWeb() {
		return pWeb;
	}

	public void setpWeb(String pWeb) {
		this.pWeb = pWeb;
	}

	
}

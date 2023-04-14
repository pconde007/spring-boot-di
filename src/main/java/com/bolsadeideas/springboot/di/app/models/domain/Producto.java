package com.bolsadeideas.springboot.di.app.models.domain;

public class Producto {

	private String nombre;
	private Integer precio;	

	public Producto(String nombare, Integer precio) {
		this.nombre = nombare;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombare(String nombare) {
		this.nombre = nombare;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

}

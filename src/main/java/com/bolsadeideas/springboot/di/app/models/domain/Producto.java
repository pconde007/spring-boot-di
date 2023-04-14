package com.bolsadeideas.springboot.di.app.models.domain;

public class Producto {

	private String nombare;
	private Integer precio;	

	public Producto(String nombare, Integer precio) {
		this.nombare = nombare;
		this.precio = precio;
	}

	public String getNombare() {
		return nombare;
	}

	public void setNombare(String nombare) {
		this.nombare = nombare;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

}

package com.bolsadeideas.springboot.di.app.models.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Cliente {

	//@Value("${cliente.nombre}")
	private String nombre = "Andrés";
	
	//@Value("${cliente.apellido}")
	private String apellido = "Guzmán";

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

}

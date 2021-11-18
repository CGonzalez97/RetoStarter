package com.ntt_data_bootcamp.microservicios.Models;

public class PersonaBuilder {
	
	private Long id = null;
	private String dni = null;
	private String nombre = null;
	private String apellidos = null;
	
	public PersonaBuilder id(Long id) {
		this.id = id;
		return this;
	}
	
	public PersonaBuilder dni(String dni) {
		this.dni = dni;
		return this;
	}
	
	public PersonaBuilder nombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public PersonaBuilder apellidos(String apellidos) {
		this.apellidos = apellidos;
		return this;
	}
	
	public Persona build() {
		return new Persona(this.id,this.dni,this.nombre,this.apellidos);
	}

}

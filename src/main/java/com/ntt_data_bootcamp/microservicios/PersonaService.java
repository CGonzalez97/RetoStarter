package com.ntt_data_bootcamp.microservicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ntt_data_bootcamp.microservicios.Models.Persona;

public class PersonaService {
	
	List<Persona> dbPersonas;

	public PersonaService() {
		this.dbPersonas = new ArrayList<Persona>();
	}

	public List<Persona> getDbPersonas() {
		return dbPersonas;
	}

	public void setDbPersonas(List<Persona> dbPersonas) {
		this.dbPersonas = dbPersonas;
	}
	
	public List<Persona> getAll(){
		return this.dbPersonas;
	}
	
	//Peticiones
	
	public Optional<Persona> getById(Long id){
		return this.dbPersonas.stream().filter(x -> x.getId()== id).findFirst();
	}
	
	public void updatePersona(Persona per) {
		int index = -1;
		for (Persona persona : this.dbPersonas) {
			if(persona.getId() == per.getId()) {
				index = this.dbPersonas.indexOf(persona);
			}
		}
		if(index >= 0) {
			this.dbPersonas.set(index, per);
		}
	}
	
	public void deletePersonaById(Long id) {
		int index = -1;
		for (Persona persona : this.dbPersonas) {
			if(persona.getId() == id) {
				index = this.dbPersonas.indexOf(persona);
			}
		}
		if(index >= 0) {
			this.dbPersonas.remove(index);
		}		
	}
	
	public void addPersona(Persona persona) {
		this.dbPersonas.add(persona);
	}
	
	

}

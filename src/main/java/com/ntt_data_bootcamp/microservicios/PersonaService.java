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
		Optional<Integer> i = this.dbPersonas.stream().filter(x -> x.getId() == per.getId()).map(x -> this.dbPersonas.indexOf(x)).findFirst();
		if(!i.isEmpty()) {
			this.dbPersonas.set(i.get(), per);
		}
	}
	
	public void deletePersonaById(Long id) {
		int index ;
		Optional<Integer> i = this.dbPersonas.stream().filter(x -> x.getId() == id).map(x -> this.dbPersonas.indexOf(x)).findFirst();
		index = i.get();
		if(!i.isEmpty()) {
			this.dbPersonas.remove(index);
		}		
	}
	
	public void addPersona(Persona persona) {
		this.dbPersonas.add(persona);
	}
	
	

}

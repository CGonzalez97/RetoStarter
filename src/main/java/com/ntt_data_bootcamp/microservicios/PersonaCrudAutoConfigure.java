package com.ntt_data_bootcamp.microservicios;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ntt_data_bootcamp.microservicios.Models.Persona;
import com.ntt_data_bootcamp.microservicios.Models.PersonaBuilder;

@Configuration
@ConditionalOnClass({Persona.class,PersonaBuilder.class, PersonaService.class})
public class PersonaCrudAutoConfigure {
	
	@Bean
	public PersonaBuilder personaBuilder() {
		return new PersonaBuilder();
	}
	
	@Bean
	public PersonaService personaService() {
		return new PersonaService();
	}

}

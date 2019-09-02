package edu.usal.service;

import java.util.List;

import org.springframework.stereotype.Component;

import edu.usal.dto.Person;


@Component
public interface PersonasService
{
	    
	//public List<Persona> obtenerPersonasxFiltro(String filtro);
	public Person obtenerPersona(Long person);

}

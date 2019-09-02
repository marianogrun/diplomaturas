package edu.usal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import edu.usal.dao.PersonDao;

import edu.usal.dto.Person;


@Component
//@PropertySource("classpath:general.properties")
public class PersonasServiceImpl implements PersonasService{

	//@Autowired
	//private Environment env;

	@Autowired
	private PersonDao personDao;
	
	public Person obtenerPersona(Long person) {
    	return personDao.obtenerPersona(person);
	}

	

}

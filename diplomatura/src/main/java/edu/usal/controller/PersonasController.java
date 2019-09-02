package edu.usal.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.usal.config.UniversitasConstants;

import edu.usal.dto.Person;

import edu.usal.dto.Response;

import edu.usal.service.PersonasService;



@RestController
@Scope("session")
public class PersonasController {
	
	@Autowired
	private PersonasService personasService;
	
	
	@RequestMapping(value ="/obtenerPersona", method = RequestMethod.POST)
	public Response obtenerPersona(@RequestHeader(value="Authority") String token,@RequestBody Person persona,HttpServletResponse response) throws Exception	{
		try 
		{
			return new Response(true, personasService.obtenerPersona(persona.getPerson()), UniversitasConstants.REST_STATUS_CODE_OK);
		}
		catch(Exception e)
		{
			return new Response(false, null, e.getMessage());
		}
		
	}
}	
	

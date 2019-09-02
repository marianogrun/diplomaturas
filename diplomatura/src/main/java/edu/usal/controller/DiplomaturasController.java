package edu.usal.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.usal.config.UniversitasConstants;
import edu.usal.dto.Diplomatura;

import edu.usal.dto.Response;
import edu.usal.service.DiplomaturasService;


@RestController
@Scope("session")
public class DiplomaturasController {
	
	@Autowired
	private DiplomaturasService diplomaturasService;
	
	
	@RequestMapping(value ="/guardarDiplomatura", method = RequestMethod.POST)
		public Response guardarDiplomatura(@RequestBody Diplomatura diplomatura,HttpServletResponse response) throws Exception	{
	//public Response guardarDiplomatura(@RequestHeader(value="Authority") String token,@RequestBody Diplomatura diplomatura,HttpServletResponse response) throws Exception	{
		//public Response guardarDiplomatura(@RequestHeader(value="Authority") String token,HttpServletResponse response) throws Exception	{
		try 
		{
			System.out.println("Todo bien");
			diplomaturasService.guardarDiplomatura(diplomatura);
			return new Response(true, null, "ok");
//			return new Response(true, diplomaturasService.guardarDiplomatura(diplomatura), UniversitasConstants.REST_STATUS_CODE_OK);
		}
		catch(Exception e)
		{
			return new Response(false, null, e.getMessage());
		}
		
	}
}	
package edu.usal.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.usal.dto.DipFacuAsoc;

import edu.usal.dto.Response;
import edu.usal.service.DipFacuAsocService;


@RestController
@Scope("session")
public class DipFacuAsocController {
	
	@Autowired
	private DipFacuAsocService dipFacuAsocService;
	
	
	@RequestMapping(value ="/guardarDipFacuAsoc", method = RequestMethod.POST)
		public Response guardarDipFacuAsoc(@RequestBody DipFacuAsoc dipFacuAsoc,HttpServletResponse response) throws Exception	{
	//public Response guardarDiplomatura(@RequestHeader(value="Authority") String token,@RequestBody Diplomatura diplomatura,HttpServletResponse response) throws Exception	{
		//public Response guardarDiplomatura(@RequestHeader(value="Authority") String token,HttpServletResponse response) throws Exception	{
		try 
		{
			System.out.println("Todo bien");
			dipFacuAsocService.guardarDipFacuAsoc(dipFacuAsoc);
			return new Response(true, null, "ok");
//			return new Response(true, diplomaturasService.guardarDiplomatura(diplomatura), UniversitasConstants.REST_STATUS_CODE_OK);
		}
		catch(Exception e)
		{
			return new Response(false, null, e.getMessage());
		}
		
	}
}	

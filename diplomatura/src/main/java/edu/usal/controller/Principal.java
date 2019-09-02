package edu.usal.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import edu.usal.dto.Diplomatura;
import edu.usal.service.DiplomaturasService;
import edu.usal.service.DiplomaturasServiceImpl;

public class Principal {
	@Autowired
	private DiplomaturasService diplomaturasService;

	public  void main()  {
		
	try {
		
//		DiplomaturasServiceImpl diplomaturasService= new DiplomaturasServiceImpl();
		Diplomatura d = new Diplomatura();
		d.setCarrera(15);
		System.out.println("Patronus!!!!");
		//diplomaturasService.guardarDiplomatura(d);
		
	}catch (Exception e){
		System.out.println(e.getMessage());
	}
	
	}

}

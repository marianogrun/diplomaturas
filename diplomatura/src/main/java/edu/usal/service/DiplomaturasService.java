package edu.usal.service;

import java.sql.SQLException;

import org.springframework.stereotype.Component;

import edu.usal.dto.Diplomatura;

@Component
public interface DiplomaturasService {
	
	public Diplomatura obtenerDiplomatura(Integer idDipCareer);
	public void guardarDiplomatura(Diplomatura diplomatura)throws SQLException;

}

package edu.usal.service;

import org.springframework.stereotype.Component;

import edu.usal.dto.DipFacuAsoc;

@Component
public interface DipFacuAsocService {
	
	public DipFacuAsoc obtenerDipFacuAsoc(Integer idDipCareer);
	public void guardarDipFacuAsoc(DipFacuAsoc dipFacuAsoc);
}

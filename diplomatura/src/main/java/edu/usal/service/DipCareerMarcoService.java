package edu.usal.service;

import org.springframework.stereotype.Component;

import edu.usal.dto.DipCareerMarco;


@Component
public interface DipCareerMarcoService {
	
	public DipCareerMarco obtenerDipCareerMarco(Integer idDipCareer);
	public void guardarDipCareerMarco (DipCareerMarco dipCareerMarco);

}

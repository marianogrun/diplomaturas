package edu.usal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.usal.dao.DipFacuAsocDao;
import edu.usal.dao.DiplomaturaDao;
import edu.usal.dto.DipFacuAsoc;

@Component
public class DipFacuAsocServiceImpl implements DipFacuAsocService{
	@Autowired
	private DipFacuAsocDao dipFacuAsocDao;

	public DipFacuAsoc obtenerDipFacuAsoc(Integer idDipCareer) {
		
		return dipFacuAsocDao.obtenerDipFacuAsoc(idDipCareer);
	}
	
	public void guardarDipFacuAsoc (DipFacuAsoc dipFacuAsoc) {
		
		dipFacuAsocDao.guardarDipFacuAsoc(dipFacuAsoc);
	}
	
	
}

package edu.usal.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.usal.dao.DipCareerMarcoDao;

import edu.usal.dto.DipCareerMarco;

public class DipCareerMarcoServiceImpl implements DipCareerMarcoService {
	@Autowired
	private DipCareerMarcoDao dipCareerMarcoDao;
	public DipCareerMarco obtenerDipCareerMarco(Integer idDipCareer) {
		// TODO Auto-generated method stub
		return dipCareerMarcoDao.obtenerDipCareerMarco(idDipCareer);
	}
	
	public void guardarDipCareerMarco (DipCareerMarco dipCareerMarco) {
		
		dipCareerMarcoDao.guardarDipCareerMarco(dipCareerMarco);
	}
		
}

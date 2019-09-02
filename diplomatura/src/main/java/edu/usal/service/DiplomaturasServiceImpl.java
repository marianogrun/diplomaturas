package edu.usal.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import edu.usal.dao.DiplomaturaDao;
import edu.usal.dto.Diplomatura;

@Component
public class DiplomaturasServiceImpl implements DiplomaturasService {
	
	@Autowired
	private DiplomaturaDao diplomaturaDao;
	
	public Diplomatura obtenerDiplomatura(Integer idDipCareer) {
		
		return diplomaturaDao.obtenerDiplomatura(idDipCareer);
	}

	public void guardarDiplomatura(Diplomatura diplomatura ) throws SQLException  {
		
		diplomaturaDao.guardarDiplomatura(diplomatura);
		
		
	}
	
	

}

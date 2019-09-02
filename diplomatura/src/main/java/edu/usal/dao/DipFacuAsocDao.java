package edu.usal.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.usal.dto.DipFacuAsoc;

import edu.usal.mapper.DipFacuAsocMapper;


@Repository
@Transactional ("transactionManager")
public class DipFacuAsocDao extends JdbcDaoSupport {
	
	 	@Autowired
	    public DipFacuAsocDao(DataSource dataSourceAcademica) {
	        this.setDataSource(dataSourceAcademica);
	    }
	 	
	 	public DipFacuAsoc obtenerDipFacuAsoc(Integer idDipCareer){
	 		String sql="";
	    	
	    	sql= DipFacuAsocMapper.BASE_SQL_DIPFACUASOC;
	    	
		         
		        Object[] params;

		        sql += "where " + 
		        		" dipcareer =? " ; 
		        
	        	params = new Object[] {idDipCareer};
	        	
	        	
	        	DipFacuAsocMapper mapper = new DipFacuAsocMapper();
	            DipFacuAsoc dipFacuAsoc = this.getJdbcTemplate().queryForObject(sql, params, mapper);
	            return dipFacuAsoc;
	 		
	 		
	 	}
	 	
	 	public void guardarDipFacuAsoc (DipFacuAsoc dipFacuAsoc) {
	 		
	 		
	 		String sql="";
			
			sql="INSERT INTO EXPEDIENTE.DIPFACUASOC (IDDIPCAREER,FACU) VALUES (expediente.dipcareer_seq.nextval,?)";
			
			Object [] params;
			params= new Object[] {dipFacuAsoc.getFacu()};
						
			
			
			
			
			/*
			sql +="where "+
					"dipcareer =? " ;
			
			params = new Object[];
			DiplomaturaMapper mapper= new DiplomaturaMapper();
			Diplomatura diplomatura= this.getJdbcTemplate().queryForObject(sql,mapper);
			*/
			this.getJdbcTemplate().update(sql,params);
			
	 		
	 		
	 	}

}

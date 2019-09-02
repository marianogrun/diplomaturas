package edu.usal.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.usal.dto.DipCareerMarco;

import edu.usal.mapper.DipCareerMarcoMapper;


@Repository
@Transactional ("transactionManager")
public class DipCareerMarcoDao extends JdbcDaoSupport {
	
	 	@Autowired
	    public DipCareerMarcoDao(DataSource dataSourceAcademica) {
	        this.setDataSource(dataSourceAcademica);
	    }
	 	
	 	public DipCareerMarco obtenerDipCareerMarco(Integer idDipCareer){
	 		String sql="";
	    	
	    	sql= DipCareerMarcoMapper.BASE_SQL_DIPCAREERMARCO;
	    	
		         
		        Object[] params;

		        sql += "where " + 
		        		" dipcareer =? " ; 
		        
	        	params = new Object[] {idDipCareer};
	        	
	        	
	        	DipCareerMarcoMapper mapper = new DipCareerMarcoMapper();
	            DipCareerMarco dipCareerMarco = this.getJdbcTemplate().queryForObject(sql, params, mapper);
	            return dipCareerMarco;
	 		
	 		
	 	}
	 	
	 		public void guardarDipCareerMarco (DipCareerMarco dipCareerMarco) {
	 		
	 		
	 		String sql="";
			
			sql="INSERT INTO EXPEDIENTE.DIPCAREERMARCO (IDDIPCAREER,FUNDAMENTACION,OBJETIVO,DESTINATARIO,REQUISITOSINGRESO,DURACION,"
					+ "EVALUACION,CORRELATIVIDAD,LUGARDICTADO"
					+ ") VALUES (expediente.dipcareer_seq.nextval,?,?,?,?,?,?,?,?)";
			
			Object [] params;
			params= new Object[] {dipCareerMarco.getFundamentacion(),
							dipCareerMarco.getObjetivo(),
							dipCareerMarco.getDestinatario(),
							dipCareerMarco.getRequisitosIngreso(),
							dipCareerMarco.getDuracion(),
							dipCareerMarco.getEvaluacion(),
							dipCareerMarco.getCorrelatividad(),
							dipCareerMarco.getLugarDictado()};
						
			
			
			
			
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

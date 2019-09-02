package edu.usal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.usal.dto.Diplomatura;
import edu.usal.mapper.DiplomaturaMapper;



@Repository
@Transactional("transactionManager")
public class DiplomaturaDao extends JdbcDaoSupport{
    @Autowired
    public DiplomaturaDao(DataSource dataSourceAcademica) {
        this.setDataSource(dataSourceAcademica);
    }
	public Diplomatura obtenerDiplomatura(Integer idDipCareer) {
    	String sql="";
    	
    	sql= DiplomaturaMapper.BASE_SQL_DIPCAREER;
    	
	         
	        Object[] params;

	        sql += "where " + 
	        		" dipcareer =? " ; 
	        
        	params = new Object[] {idDipCareer};
        	
        	
        	DiplomaturaMapper mapper = new DiplomaturaMapper();
            Diplomatura diplomatura = this.getJdbcTemplate().queryForObject(sql, params, mapper);
            return diplomatura;
        	
    }
	
	public void guardarDiplomatura (Diplomatura diplomatura) throws SQLException {
		String sql="";
		
		sql="INSERT INTO EXPEDIENTE.DIPCAREER (IDDIPCAREER,DESCRIP,RESPONSABLE,CARTYPE,DEGREEDESCRIP,CONCONVENIO,"
				+ "CAREERMODOCURSADA) VALUES (expediente.dipcareer_seq.nextval,?,?,?,?,?,?)";
		
		//insert into expediente.dipcareer values (expediente.DipCareer_SEQ.nextval,1,'abogacia','abog',7,15,'Abogacia Franco Argentina','Abogado Frances','Filips',0,1);
		
		
		//insert into dipcareer (IDDIPCAREER,CAREER) values(expediente.dipcareer_seq.nextval,2);
		
		
		
		//Object [] params= new Object [] {1,"abogado","boga",7,15,"aogacia franco argentina","Abogado","responsable",0,2};
		
		Object [] params;
		params= new Object[] {diplomatura.getDescripcion(),
							diplomatura.getReponsable(),
							diplomatura.getTipoCarrera(),
							diplomatura.getDescripDegree(),
							diplomatura.getConConvenio(),
							diplomatura.getModoCursada()};
					
		
		
		
		
		/*
		sql +="where "+
				"dipcareer =? " ;
		
		params = new Object[];
		DiplomaturaMapper mapper= new DiplomaturaMapper();
		Diplomatura diplomatura= this.getJdbcTemplate().queryForObject(sql,mapper);
		*/
		this.getJdbcTemplate().update(sql,params);
		
		
		
	}
	
	/*private Integer obtenerId() throws SQLException {
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@padua3:1521/desase","expediente","expediente");
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("select * from expediente.dipcareer");
		int id=rs.getInt("expediente.DipCareer_SEQ.nextval");
		return id;
	}*/
	
	
}

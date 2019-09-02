package edu.usal.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.usal.dto.Diplomatura;

public class DiplomaturaMapper implements RowMapper<Diplomatura> {
	
	public static final String BASE_SQL_DIPCAREER = //
            "Select IDDIPCAREER,CAREER,DESCRIP,SDESC,CARTYPE,FACU,LDESC,DEGREEDESCRIP,RESPONSABLE,CONCONVENIO, " + 
            "	CAREERMODOCURSADA " +
            "	From expediente.dipcareer ";
	
	public static final String SQL_INSERT_DIPCAREER =//
			"INSERT INTO EXPEDIENTE.DIPCAREER (IDDIPCAREER,CAREER,DESCRIP,SDESC,CARTYPE,FACU,LDESC,DEGREEDESCRIP,RESPONSABLE,CONCONVENIO,"
			+ "CAREERMODOCURSADA) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
	
	public Diplomatura mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Integer idDipCareer= rs.getInt("IDDIPCAREER");
		Integer carrera=rs.getInt("CAREER");
		String descripcion=rs.getString("DESCRIP");
		String descripCorta=rs.getString("SDESC");
		Integer tipoCarrera=rs.getInt("CARTYPE");
		Integer facultad=rs.getInt("FACU");
		String descripLarga=rs.getString("LDESC");
		String descripDegree=rs.getString("DEGREEDESCRIP");
		String reponsable=rs.getString("RESPONSABLE");
		Integer conConvenio=rs.getInt("CONCONVENIO");
		Integer modoCursada=rs.getInt("CAREERMODOCURSADA");
		
		Diplomatura diplomatura=new Diplomatura();
		diplomatura.setIdDipCareer(idDipCareer);
		diplomatura.setCarrera(carrera);
		diplomatura.setDescripcion(descripcion);
		diplomatura.setDescripCorta(descripCorta);
		diplomatura.setTipoCarrera(tipoCarrera);
		diplomatura.setFacultad(facultad);
		diplomatura.setDescripLarga(descripLarga);
		diplomatura.setDescripDegree(descripDegree);
		diplomatura.setReponsable(reponsable);
		diplomatura.setConConvenio(conConvenio);
		diplomatura.setModoCursada(modoCursada);
		
		
		return diplomatura;
	}

	
		
}

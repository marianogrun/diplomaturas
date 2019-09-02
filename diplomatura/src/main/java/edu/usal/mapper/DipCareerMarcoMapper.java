package edu.usal.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.usal.dto.DipCareerMarco;


public class DipCareerMarcoMapper implements RowMapper<DipCareerMarco> {
	
	public static final String BASE_SQL_DIPCAREERMARCO = //
            "Select IDDIPCAREER,FACU " +
            " From expediente.dipfacuasoc ";

	public DipCareerMarco mapRow(ResultSet rs, int rowNum) throws SQLException {
		Integer idDipCareer=rs.getInt("IDDIPCAREER");
		String fundamentacion=rs.getString("FUNDAMENTACION");
		String objetivo=rs.getString("OBJETIVO");
		String destinatario=rs.getString("DESTINATARIO");
		String requisitosIngreso=rs.getString("REQUISITOSINGRESO");
		Integer duracion=rs.getInt("DURACION");
		String evaluacion=rs.getString("EVALUACION");
		String correlatividad=rs.getString("CORRELATIVIDAD");
		String lugarDictado=rs.getString("LUGARDICTADO");
		
		
		
		DipCareerMarco dipCareerMarco =new DipCareerMarco();
		dipCareerMarco.setIdDipCareer(idDipCareer);
		dipCareerMarco.setFundamentacion(fundamentacion);
		dipCareerMarco.setObjetivo(objetivo);
		dipCareerMarco.setDestinatario(destinatario);
		dipCareerMarco.setRequisitosIngreso(requisitosIngreso);
		dipCareerMarco.setDuracion(duracion);
		dipCareerMarco.setEvaluacion(evaluacion);
		dipCareerMarco.setCorrelatividad(correlatividad);
		dipCareerMarco.setLugarDictado(lugarDictado);
		
		return dipCareerMarco;
	}

}

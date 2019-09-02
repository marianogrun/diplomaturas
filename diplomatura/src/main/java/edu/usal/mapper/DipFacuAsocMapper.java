package edu.usal.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.usal.dto.DipFacuAsoc;


public class DipFacuAsocMapper implements RowMapper<DipFacuAsoc> {
	
	public static final String BASE_SQL_DIPFACUASOC = //
            "Select IDDIPCAREER,FACU " +
            " From expediente.dipfacuasoc ";

	public DipFacuAsoc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Integer idDipCareer=rs.getInt("IDDIPCAREER");
		Integer facu=rs.getInt("FACU");
		
		DipFacuAsoc dipFacuAsoc =new DipFacuAsoc();
		dipFacuAsoc.setIdDipCareer(idDipCareer);
		dipFacuAsoc.setFacu(facu);
		
		return dipFacuAsoc;
	}

}

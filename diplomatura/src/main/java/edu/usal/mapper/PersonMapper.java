package edu.usal.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import edu.usal.dto.Person;


public class PersonMapper implements RowMapper<Person>{

    public static final String BASE_SQL_ORIGEN_APPGRAL = //
            "Select PERSON,LNAME,FNAME,COUNTRY,POLDIV,CITY,BIRDATE,NATION,SEX,MARSTAT, " + 
            "	ADDRESS,RCOUNTRY,RPOLDIV,RCITY,TELEP,ACTIVE,TNATION,INCOUNTRYSINCE, " +
            "	RELIGION,QBROTHER,QSON " +
            "	From appgral.person ";
    public static final String BASE_SQL_ORIGEN_PERSONAL = //
            "Select PERSON,LNAME,FNAME,COUNTRY,POLDIV,CITY,BIRDATE,NATION,SEX,MARSTAT, " + 
            "	ADDRESS,RCOUNTRY,RPOLDIV,RCITY,TELEP,ACTIVE,TNATION,INCOUNTRYSINCE, " +
            "	RELIGION,QBROTHER,QSON " +
            "	From Personal.person ";
    
	    
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {

        Long person = rs.getLong("PERSON");
    	String apellido = rs.getString("LNAME");
    	String nombre = rs.getString("FNAME");
    	String codigoPaisNacimiento = rs.getString("COUNTRY");
    	String codigoProvinciaNacimiento = rs.getString("POLDIV");
    	String codigoLocalidadNacimiento = rs.getString("CITY");
    	Date fechaNacimiento = rs.getDate("BIRDATE");
    	String nacionalidad = rs.getString("NATION");
    	Integer sexo = rs.getInt("SEX");
    	Integer estadoCivil = rs.getInt("MARSTAT");
    	String domicilio = rs.getString("ADDRESS");
    	String codigoPaisResidencia = rs.getString("RCOUNTRY");
    	String codigoProvinciaResidencia = rs.getString("RPOLDIV");
    	String codigoLocalidadResidencia = rs.getString("RCITY");
    	String telefono = rs.getString("TELEP");
    	Boolean activo = rs.getBoolean("ACTIVE");
    	Integer tipoNacionalidad = rs.getInt("TNATION");
    	Date fechaIngresoPais = rs.getDate("INCOUNTRYSINCE");
    	Integer religion = rs.getInt("RELIGION");
    	Integer cantidadHermanos = rs.getInt("QBROTHER");
    	Integer cantidadHijos = rs.getInt("QSON");

        Person persona = new Person();
        persona.setPerson(person);
        persona.setApellido(apellido);
        persona.setActivo(activo);
        persona.setCodigoLocalidadNacimiento(codigoLocalidadNacimiento);
        persona.setCodigoLocalidadResidencia(codigoLocalidadResidencia);
        persona.setCantidadHermanos(cantidadHermanos);
        persona.setCantidadHijos(cantidadHijos);
        persona.setCodigoPaisNacimiento(codigoPaisNacimiento);
        persona.setCodigoPaisResidencia(codigoPaisResidencia);
        persona.setCodigoProvinciaNacimiento(codigoProvinciaNacimiento);
        persona.setCodigoProvinciaResidencia(codigoProvinciaResidencia);
        persona.setDomicilio(domicilio);
        persona.setEstadoCivil(estadoCivil);
        persona.setFechaIngresoPais(fechaIngresoPais);
        persona.setFechaNacimiento(fechaNacimiento);
        persona.setNacionalidad(nacionalidad);
        persona.setNombre(nombre);
        persona.setReligion(religion);
        persona.setSexo(sexo);
        persona.setTelefono(telefono);
        persona.setTipoNacionalidad(tipoNacionalidad);
        
        return persona;
    }

}

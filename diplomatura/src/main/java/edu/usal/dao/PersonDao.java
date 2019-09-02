package edu.usal.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.usal.config.UniversitasConstants;
import edu.usal.dto.Person;
import edu.usal.mapper.PersonMapper;


@Repository
@Transactional("transactionManager")
public class PersonDao extends JdbcDaoSupport{
    @Autowired
    public PersonDao(DataSource dataSourceAcademica) {
        this.setDataSource(dataSourceAcademica);
    }
	public Person obtenerPersona(Long person) {
    	String sql="";
    	
    	sql= PersonMapper.BASE_SQL_ORIGEN_APPGRAL;
    	/*switch(origen){
    	case UniversitasConstants.PERSONA_ORIGEN_APPGRAL:
        	sql= PersonMapper.BASE_SQL_ORIGEN_APPGRAL;
            break;
        case UniversitasConstants.PERSONA_ORIGEN_PERSONAL:
        	sql= PersonMapper.BASE_SQL_ORIGEN_PERSONAL;
            break;
        
            
        default:
        	Person persona =new Person();
        	return persona;
    	}*/
	         
	        Object[] params;

	        sql += "where " + 
	        		" person =? " ; 
	        
        	params = new Object[] {person};
        	PersonMapper mapper = new PersonMapper();
            Person persona = this.getJdbcTemplate().queryForObject(sql, params, mapper);
            return persona;
        	
    }
}

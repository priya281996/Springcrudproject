package springMvc.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springMvc.model.Emp;
@Transactional
@Repository
public class EmpDao {
	HibernateTemplate template;  
	  
	public void setTemplate(HibernateTemplate template) {  
		this.template = template;  
	}  
	public void save(Emp p){  
		  
		template.save(p);  
	}  
	public void update(Emp p){   
				template.update(p);  
	}  
	public void delete(Emp p){ 
		
	   template.delete(p);  
	}  
	public Emp getEmpById(int id){  
		 
	    Emp p=(Emp)this.template.get(Emp.class,id);
	    return p;
	}
	public List<Emp> getEmployees(){  
		  
	   List<Emp> list=new ArrayList<Emp>();
	   list=template.loadAll(Emp.class);
	   return list;
	}
	
	}
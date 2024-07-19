package com.springorm.dao;

import java.io.Serializable;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springcore.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	// Save Student 
	public int insert(Student student) {
		
		Integer i = (Integer)this.hibernateTemplate.save(student);
		
		return i;
	}

}

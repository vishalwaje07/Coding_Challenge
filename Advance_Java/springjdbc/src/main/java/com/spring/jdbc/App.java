package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started" );
        
        //Spring JDBC => JDBC Template
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        Student student = new Student();
        student.setId(2);
        student.setName("Nikhil Hirve");
        student.setCity("Pune");
        
        int result = studentDao.insert(student);
        System.out.println(result);
        
    
    }
}

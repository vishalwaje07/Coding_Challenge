package com.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;
import com.springorm.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao= context.getBean("studentDao", StudentDao.class);
        
        Student student = new Student(3,"Sarthak Gite", "Pune");
        
        int result=studentDao.insert(student);
        
        System.out.println("Done"+result);
    }
}

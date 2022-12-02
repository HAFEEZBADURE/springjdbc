package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("My program started.........");
		// spring jdbc =>jdbcTemplate

//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// insert
//		Student student = new Student(666, "raju", "bihar");
//		int result = studentDao.insert(student);
//		System.out.println("student added" + result);

		// update the details
//		Student student = new Student();
//		student.setId(10);
//		student.setName("badure");
//		student.setCity("basavakalyan");
//		int result = studentDao.change(student);
//		System.out.println("data changed " + result);

//		delete 
//		int result = studentDao.delete(11);
//		System.out.println("delete " + result);

//		// select
//		Student student = studentDao.getStudent(10);
//		System.out.println(student);

		List<Student> students = studentDao.getAllStudents();

		for (Student s : students) {
			System.out.println(s);
		}
	}
}

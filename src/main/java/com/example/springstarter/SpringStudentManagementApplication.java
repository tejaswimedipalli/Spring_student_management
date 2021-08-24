package com.example.springstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springstarter.entity.Student;
import com.example.springstarter.repository.StudentRepository;

@SpringBootApplication
public class SpringStudentManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringStudentManagementApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * Student student1= new Student("Taehyung","Kim","taetae@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2= new Student("JungKook","Jeon","kookie@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3= new Student("Jimin","Park","chimmy@gmail.com");
		 * studentRepository.save(student3);
		 */
	}
	

}

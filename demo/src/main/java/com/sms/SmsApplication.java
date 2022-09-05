package com.sms;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsApplication{ // implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}

//	private StudentRepository studentRepository;
//	@Override
//	public void run(String... args) throws Exception {
//		Student student1 = new Student("Hadiza", "Isa", "Hadee@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Hadiz", "Abdul", "Hadeeza@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Elijah", "Woods", "eleeDa@gmail.com");
//		studentRepository.save(student3);
//	}

}

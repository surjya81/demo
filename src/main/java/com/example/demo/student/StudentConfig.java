package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student AlterEgo = new Student(1, "AlterEgo", "alter.728@ego.com", LocalDate.of(2000, Month.NOVEMBER, 18));
			Student Alte = new Student(2, "Alteo", "alte.28@ego.com", LocalDate.of(2001, Month.NOVEMBER, 28));

			repository.saveAll(List.of(AlterEgo, Alte));
		};
	}

}

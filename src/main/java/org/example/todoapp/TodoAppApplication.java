package org.example.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

//	@Value("${DB_USERNAME}")
//	private String dbUsername;
//	@Value("${DB_PASSWORD}")
//	private String dbPassword;
//	@Bean
//	public CommandLineRunner run(){
//		return args -> {
//			System.out.println("DB_USERNAME:::"+dbUsername);
//			System.out.println("DB_PASSWORD:::"+dbPassword);
//		};
//	}
}

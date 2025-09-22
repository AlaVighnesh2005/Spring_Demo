package com.vvit.Hibernate_App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateAppApplication implements CommandLineRunner {

	@Autowired
	UserRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(HibernateAppApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception
	{
		Employee emp = new Employee(222,"VVIT");
		repo.save(emp);
	}
}

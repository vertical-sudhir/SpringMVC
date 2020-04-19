package com.vertical.sudhir.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vertical.sudhir.demo.entities.User;
import com.vertical.sudhir.demo.repositories.UserRepository;

@SpringBootApplication
public class SpringMvcThymleafApplication {

	@Autowired
	UserRepository userRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcThymleafApplication.class, args);
	}

	
	@PostConstruct
	public void createUser()
	{
		User u1 = new User("Sudhir Atkire", "password1", "sudhir@gmail.com", 10000.2);
		User u2 = new User("Priyanka Atkire", "password2", "priyanka@gmail.com", 20000.2);
		User u3 = new User("Priyansi Atkire", "password3", "shonu@gmail.com", 30000.2);
		userRepository.save(u1);
		userRepository.save(u2);
		userRepository.save(u3);
	}
	
	
}

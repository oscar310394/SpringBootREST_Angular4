package com.codeovm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codeovm.entities.User;
import com.codeovm.repositories.UserRepository;

@SpringBootApplication
public class CrudBackEndApplication implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	
	public static void main(String[] args) {
		SpringApplication.run(CrudBackEndApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		userRepository.save(new User("one","one"));
		userRepository.save(new User("two","two"));
		userRepository.save(new User("three","three"));
	}
}

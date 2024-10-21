package com.example.spring_jenkins_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
	
	
	@GetMapping("/users")
	public String getData(){
		return "Get data for Users";
	}

}

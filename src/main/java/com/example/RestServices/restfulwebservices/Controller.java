package com.example.RestServices.restfulwebservices;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorld() {
		return new HelloWorldBean("Hello World");
	}

}

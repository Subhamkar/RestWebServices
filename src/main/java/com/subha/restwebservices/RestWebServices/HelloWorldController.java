package com.subha.restwebservices.RestWebServices;

import javax.jws.WebMethod;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	@GetMapping("/helloWorld")
	public String HelloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/helloWorldBean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping("/helloWorldBean/{path}")
	public HelloWorldBean helloWorldBean(@PathVariable String path) {
		return new HelloWorldBean(String.format("Hello World, %s", path));
	}
}

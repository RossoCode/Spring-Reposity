package com.example.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring!";
	}

	@GetMapping("/hello")
	public String hello() {return "Hello World!";}

	@GetMapping("/greeting")
	public ResponseEntity<String> greeting() {return new ResponseEntity<>( "Buon pomeriggio!",HttpStatus.OK);}

}

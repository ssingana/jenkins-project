package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	
	
	@GetMapping(value="jenkins")
	public String jenkins() {
		return "Hi jenkins adfadfsadf";
	}

}

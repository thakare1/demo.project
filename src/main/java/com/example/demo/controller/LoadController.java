package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lead")
public class LoadController {

	@GetMapping
	public String createLoad(){
		return "hello";
		
	}
	
	
}

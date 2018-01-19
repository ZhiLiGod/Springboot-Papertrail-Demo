package com.example.springbootpapertraildemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootpapertraildemo.SpringbootpapertraildemoApplication;

@RestController
public class HomeController {
	
	private static final Logger log = LoggerFactory.getLogger(SpringbootpapertraildemoApplication.class);
	
	@GetMapping("/")
	public String index() {
		return "This is home controller";
	}
	
	@GetMapping("/name")
	public String getName() {
		log.error("Error Happened", new Exception(new Exception()));
		return "Zhi Li";
	}
	
}

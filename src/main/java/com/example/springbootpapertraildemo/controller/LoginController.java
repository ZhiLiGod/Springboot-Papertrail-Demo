package com.example.springbootpapertraildemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@GetMapping("/login")
	public String login(@RequestParam String name) throws Exception {
		if(name.equals("li")) {
			return "Yes";
		}else {
			//throw new Exception("Error");
			return "";
		}
	}
	
}

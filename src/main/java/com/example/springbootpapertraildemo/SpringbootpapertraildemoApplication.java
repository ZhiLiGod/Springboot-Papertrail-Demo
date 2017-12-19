package com.example.springbootpapertraildemo;

import javax.xml.ws.RespectBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class SpringbootpapertraildemoApplication {
	
	private static final Logger log = LoggerFactory.getLogger(SpringbootpapertraildemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootpapertraildemoApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index() {
		log.warn("Welcome to springboot papertrail", new Exception(new Exception()));
		return "Hello spring boot papertrail.";
	}
}

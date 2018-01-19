package com.example.springbootpapertraildemotest.controller;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.nio.charset.Charset;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.example.springbootpapertraildemo.SpringbootpapertraildemoApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringbootpapertraildemoApplication.class)
@WebAppConfiguration
public class BaseControllerTest {
	MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("UTF-8"));
	MockMvc mockMvc;
	
	@Autowired
	WebApplicationContext webApplicationContext;
	
	@Before
	public void setup() throws Exception {
	   this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void test() throws Exception {
		throw new Exception("Error");
	}
	
}

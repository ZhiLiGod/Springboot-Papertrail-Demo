package com.example.springbootpapertraildemotest.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.http.MediaType;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import java.nio.charset.Charset;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import com.example.springbootpapertraildemo.SpringbootpapertraildemoApplication;

@RunWith(SpringRunner.class)
//@WebMvcTest(SpringbootpapertraildemoApplication.class)
@SpringBootTest(classes=SpringbootpapertraildemoApplication.class)
@WebAppConfiguration
public class HomeControllerTest {
	
	MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("UTF-8"));
	MockMvc mockMvc;
	
	@Autowired
	WebApplicationContext webApplicationContext;
	
	@Before
	  public void setup() throws Exception {
	    this.mockMvc = webAppContextSetup(webApplicationContext).build();

	  }
	
	@Test
	public void testIndex() throws Exception {
		this.mockMvc.perform(get("/"))
			.andDo(log())
			.andExpect(status().isOk());
	}
	
	@Test
	public void testGetName() throws Exception {
		this.mockMvc.perform(get("/name"))
			.andDo(log())
			.andExpect(status().isOk())
			.andExpect(content().contentType(contentType));
	}

}

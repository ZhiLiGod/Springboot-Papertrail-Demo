package com.example.springbootpapertraildemotest.controller;

import org.junit.Test;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

public class HomeControllerTest extends BaseControllerTest {
	
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
			.andExpect(status().isOk());
			//.andExpect(content().contentType(contentType));
	}

}

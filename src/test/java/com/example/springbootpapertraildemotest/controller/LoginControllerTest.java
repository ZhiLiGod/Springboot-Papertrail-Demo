package com.example.springbootpapertraildemotest.controller;

import org.junit.Test;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

public class LoginControllerTest extends BaseControllerTest{

	@Test
	public void testLogin() throws Exception {
		this.mockMvc.perform(get("/login?name={name}", "iilii"))
			.andDo(log())
			.andExpect(status().isOk());
	}

}

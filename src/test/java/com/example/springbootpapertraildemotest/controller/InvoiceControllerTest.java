package com.example.springbootpapertraildemotest.controller;

import org.junit.Test;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

public class InvoiceControllerTest extends BaseControllerTest {

	@Test
	public void testGetInvoice() throws Exception {
		this.mockMvc.perform(get("/invoice"))
			.andDo(log())
			.andExpect(status().isOk());
	}

}

package com.example.springbootpapertraildemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {
	
	@GetMapping("/invoice")
	public String getInvoice() {
		return "invoice 001";
	}
	
}

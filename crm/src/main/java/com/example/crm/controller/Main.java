package com.example.crm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

	@GetMapping("/employees")
	public String one() {

		return "Hello world";
	}

}

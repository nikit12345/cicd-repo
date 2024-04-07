package com.example.CICDpipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
	@GetMapping("/api")
	public String hello() {
		return "heloo";
	}

}

package com.springboot.azure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Demo {
	
	@GetMapping("/api")
	public String printThis() {
		return "Azure application deployed successfully";
	}
}

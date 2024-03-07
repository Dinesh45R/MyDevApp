package com.onesoft.Devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDevAppController {
	
	@GetMapping(value="/get")
	public String getThis() {
		return "Hello Nisha";
	}
	
}

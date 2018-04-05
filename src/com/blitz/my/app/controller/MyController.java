package com.blitz.my.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blitz.my.app.model.GenericRequest;

@RestController
public class MyController {

	@Autowired
	private GenericRequest genericRequest;
	
	@GetMapping("/hello")
	public String helloworld() {		
		
		System.out.println(genericRequest);
		
		return "hello";
	}
	
}

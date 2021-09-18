package com.app.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

	@GetMapping(path= "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
	public int addNumbers(@RequestParam int ...num1) {
		int sum = 0;
		for(int num = 0; num < num1.length; num++){
			sum = sum + num1[num];
		}
		return sum;
	}
	
	@GetMapping(path = "/add-double" )
	public double addNumbers(@RequestParam double ...num1) {
		double sum = 0;
		for(int num = 0; num < num1.length; num++) {
			sum = sum + num1[num];
		}
		return sum;
	}
	
	@GetMapping(path = "/subtract/{num}/{number}")
	public int subtract(@PathVariable int num, @PathVariable("number") int num2) {
		return num - num2;
	}
}

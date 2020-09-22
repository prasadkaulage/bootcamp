package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	
	@GetMapping("/sum")
	public int sum() {
		int a=60,b=40;
		return a+b;
	}
	
	@GetMapping("/sub")
	public int substract() {
		int a=60,b=40;
		return a-b;
	}
	
	@GetMapping("/mul")
	public int multiply() {
		int a=60,b=40;
		return a*b;
	}
	
	@GetMapping("/div")
	public int division() {
		int a=60,b=40;
		return a/b;
	}
	
	@GetMapping("/sqr")
	public int square() {
		int a=5;
		return a*a;
	}

}

package com;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@GetMapping("/length")
	public int calculteLength() {
		String strName="Prasad";
		return strName.length();
	}
	
	@GetMapping("/helloName")
	public String sayHelloPrasad() {
		String strName="Prasad";
		return "Helllo "+strName;
		
	}
	
	@GetMapping("/getSurname")
	public String getSurName() {
		String strName="Kaulage";
		return strName;
		
	}
	
	@GetMapping("/getDate")
	public String getDate() {
		String strDate="";
		SimpleDateFormat dateFormat=new SimpleDateFormat("MM/dd/yyyy");
		strDate=dateFormat.format(new Date());
		return strDate;
		
	}
}
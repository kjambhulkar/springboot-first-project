package com.jbk.MyfirstMicroservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping("smile")
	public String welcome(){
		
		return "Life is like riding a bicycle. To keep your balance you must keep moving.";
	}
	
	@RequestMapping("perform")
	public int add(){
		
		return 40+80;
	}

}

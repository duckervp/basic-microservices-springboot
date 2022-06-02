package com.ms.test2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test2")
public class Test2Controller {
	@GetMapping() 
	public String getContext() {
		return "test2 context";
	}
	
	@GetMapping("/greet") 
	public String getGreet() {
		return "hi from Test2!";
	}
}

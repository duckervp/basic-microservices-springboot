package com.ms.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class Test1Controller {
	@Autowired
	private Test2ServiceClient test2ServiceClient;
	
	@GetMapping()
	public String getContext() {
		return "test1 context";
	}
	
	@GetMapping("/test2-context")
	public String getTest2Context() {
		return test2ServiceClient.getTest2Context();
	}
	
	@GetMapping("/test2-greet")
	public String getTest2Greet() {
		return test2ServiceClient.getTest2Greet();
	}
}

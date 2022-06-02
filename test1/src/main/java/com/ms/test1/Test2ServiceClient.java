package com.ms.test1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("test2")
public interface Test2ServiceClient {
	@GetMapping(value = "/test2")
	String getTest2Context();
	
	@GetMapping("/test2/greet")
	String getTest2Greet();
}

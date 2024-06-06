package com.thinkconstructive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
	
	
	@GetMapping("get2")
	public String getData2() {
		
		return "Hello Rest Api2";
		}

}

package com.GTech.httpsSpring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/https/")
public class HttpsTestController {

	@GetMapping(value="hello")
	public String hello(){
		return "Welcome to Https.";
	}
}

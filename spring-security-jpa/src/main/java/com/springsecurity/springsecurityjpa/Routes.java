package com.springsecurity.springsecurityjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Routes {
	
	@GetMapping("/hello")
	public String login(){
		return ("<h1>Welcome</h1>");
	}
	
	@GetMapping("/user")
	public String user(){
		return ("<h1>Welcome from user</h1>");
	}
	
	@GetMapping("/admin")
	public String admin(){
		return ("<h1>Welcome from admin</h1>");
	}

}

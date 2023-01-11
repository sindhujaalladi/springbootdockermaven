package com.springbootdockermaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootdockermavenApplication {
	
	@GetMapping("/printmessage")
	public String getMessage() {
	return "hi welocme to docker from maven plugin";
}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdockermavenApplication.class, args);
	}

}

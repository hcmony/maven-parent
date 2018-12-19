package com.hcmony;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JvmApplication {

	public static void main(String[] args) {
		SpringApplication.run(JvmApplication.class, args);
	}

	@RequestMapping("/test")
	public String test(){
		System.out.println("----------");
		return "test";
	}
}

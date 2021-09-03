package com.javahol.githubactiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubactiondemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubactiondemoApplication.class, args);
	}

	@GetMapping("/info")
    public String info() {
        return "Hi Github Action";
    }



}

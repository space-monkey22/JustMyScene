package com.example.Moviebuff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviebuffApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviebuffApplication.class, args);
	}

}

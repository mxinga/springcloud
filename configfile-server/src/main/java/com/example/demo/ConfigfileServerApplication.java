package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableConfigServer
@SpringBootApplication
public class ConfigfileServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigfileServerApplication.class, args);
	}
}

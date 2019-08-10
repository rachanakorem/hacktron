package com.dbs.queuechallenge.application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan("com.dbs.queuechallenge")
@EnableWebMvc
@SpringBootApplication
public class Hackathon {
	
	public static void main(String[] args) {
		SpringApplication.run(Hackathon.class, args);
	}

}

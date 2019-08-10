package com.dbs.queuechallenge.application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan("com.dbs.queuechallenge")
@EnableWebMvc
@SpringBootApplication
@EnableSwagger2
public class Hackathon {
	
	public static void main(String[] args) {
		SpringApplication.run(Hackathon.class, args);
	}
	/*
	 * public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
	 * "Awesome API Title", "Awesome API Description", "1.0", "urn:tos",
	 * DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
	 */

		  private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = 
		      new HashSet<String>(Arrays.asList("application/json",
		          "application/xml"));

	
	  @Bean
	  public Docket api() {
	    return new Docket(DocumentationType.SWAGGER_2)
	        //
	        .produces(DEFAULT_PRODUCES_AND_CONSUMES)
	        .consumes(DEFAULT_PRODUCES_AND_CONSUMES);
	  }

}

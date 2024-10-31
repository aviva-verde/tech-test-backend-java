package com.avivazero.techtest.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("com.avivazero.techtest")
public class AzTechTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzTechTestApplication.class, args);
	}
	@Bean
	public RestTemplate getRestTemplateBean(){
		return new RestTemplate();
	}


}

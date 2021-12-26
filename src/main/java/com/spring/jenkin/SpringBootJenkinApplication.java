package com.spring.jenkin;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinApplication {

	public static Logger logger=LoggerFactory.getLogger(SpringBootJenkinApplication.class);
	
	@PostConstruct
	public void getMessage() {
		logger.info("Application started inside GetMessage() method updated..."); 
	}
	public static void main(String[] args) {
		logger.info("Application started inside Main() method..."); 
		SpringApplication.run(SpringBootJenkinApplication.class, args);
	}

}

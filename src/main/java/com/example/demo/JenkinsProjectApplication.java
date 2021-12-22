package com.example.demo;


import javax.annotation.PostConstruct;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication

public class JenkinsProjectApplication {
  static Logger log=(Logger) LoggerFactory.getLogger(JenkinsProjectApplication.class);
	
  @PostConstruct
  public void inti() {
		log.info("Application started");
	}
  
  public static void main(String[] args) {
		SpringApplication.run(JenkinsProjectApplication.class, args);
	log.info("its main stARTED");
	}

}

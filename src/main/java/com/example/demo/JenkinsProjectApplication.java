package com.example.demo;


import javax.annotation.PostConstruct;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;




@SpringBootApplication
@Slf4j
public class JenkinsProjectApplication {
  //static Logger log=(Logger) LoggerFactory.getLogger(JenkinsProjectApplication.class);
	
  @PostConstruct
  public void inti() {
		log.info("Application started");
	}
  
  public static void main(String[] args) {
		SpringApplication.run(JenkinsProjectApplication.class, args);
	log.info("its main stARTED");
	}

}

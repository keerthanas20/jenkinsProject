package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsProjectApplicationTests {
	static Logger log=(Logger) LoggerFactory.getLogger(JenkinsProjectApplication.class);
	
	@Test
	void contextLoads() {
		log.info("test case executing");
		assertEquals(true, true);
	}

}

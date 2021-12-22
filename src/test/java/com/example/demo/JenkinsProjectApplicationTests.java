package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class JenkinsProjectApplicationTests {
	//static Logger log=(Logger) LoggerFactory.getLogger(JenkinsProjectApplication.class);
	
	@Test
	void contextLoads() {
		log.info("test case executing");
		assertEquals(true, true);
	}

}

package com.spring.jenkin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(SpringBootJenkinApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Inside Test Cases");
		assertEquals(true, true);
	}

}

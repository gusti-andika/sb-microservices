package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"spring.profiles.active=native"})
class ConfigServerApplicationTests {

	@Test
	void contextLoads() {
	}

}

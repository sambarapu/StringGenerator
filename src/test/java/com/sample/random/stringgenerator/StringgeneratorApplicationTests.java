package com.sample.random.stringgenerator;

import com.sample.random.stringgenerator.controller.RandomStringController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * context testng where controllers are property created
 */
@SpringBootTest
class StringgeneratorApplicationTests {

	@Autowired
	private RandomStringController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}

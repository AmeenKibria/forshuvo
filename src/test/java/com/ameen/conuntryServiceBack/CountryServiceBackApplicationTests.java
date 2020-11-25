package com.ameen.conuntryServiceBack;

import com.ameen.conuntryServiceBack.controller.CountryController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CountryServiceBackApplicationTests {

	@Autowired
	private CountryController controller;


	@Test
	void contextLoads() throws Exception{
		Assertions.assertThat(controller).isNotNull();
	}

}

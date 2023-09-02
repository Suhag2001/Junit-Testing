package com.bootcoding.JUnitTesting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JUnitTestingApplicationTests {

	private  Calculater c = new Calculater();
	@Test
	@Disabled
	void contextLoads() {

	}

	@Test
	void testSum(){
		int expectedResult = 15;
		int actualResult = c.addTo(5,5,5);
		Assertions.assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void testProd(){
		int expectedResult = 20;
		int actualResult = c.mulTo(5, 4);
		Assertions.assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void  compairNums(){
		boolean actualResult = c.compareTwoNums(2, 2);
		Assertions.assertThat(actualResult).isTrue();
	}



}

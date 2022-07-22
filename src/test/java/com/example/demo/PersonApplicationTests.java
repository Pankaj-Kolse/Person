package com.example.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class PersonApplicationTests {
	private Calculator c = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	@Disabled
	void testSum1() {
		//expected
		int expectedResult = 17;
		//actual
		int actualResult = c.doSum(12, 3, 2);
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testProduct2() {
		//expected
		int expectedResult = 6;
		//actual
		int actualResult = c.doProduct(3, 2);
		assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void testCompareNums3(){
		//actual result
		Boolean actualResult = c.compareTwoNums(3, 3);
		assertThat(actualResult).isTrue();



	}


}



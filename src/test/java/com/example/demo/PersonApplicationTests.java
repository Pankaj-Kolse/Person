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
		int expectedResult = 17;
		int actualResult = c.doSum(12, 3, 2);
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testProduct2() {
		int expectedResult = 6;
		int actualResult = c.doProduct(3, 2);
		assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void testCompareNums3(){
		Boolean actualResult = c.compareTwoNums(3, 3);
		assertThat(actualResult).isTrue();

	}


}



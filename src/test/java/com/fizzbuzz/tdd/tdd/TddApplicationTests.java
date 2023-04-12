package com.fizzbuzz.tdd.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddApplicationTests {

	TddApplication app = new TddApplication();

	@Test
	void testGetNumbers1to100() {
		Assertions.assertEquals(100, app.getNumbers1to100());
	}

	@Test
	void printParameterNumberTest() {
		Assertions.assertEquals(5, app.getNumber(5));
	}

	@Test
	void returnBooleanNumberIsThreeMultipleTest() {
		Assertions.assertTrue(app.isThreeMultiple(9));
	}

	@Test
	void returnBooleanNumberIsFiveMultipleTest() {
		Assertions.assertTrue(app.isFiveMultiple(10));
	}

	@Test
	void numberIsBothMultipleTest() {
		Assertions.assertEquals("FizzBuzz", app.isMultiple(15));
	}

	@Test
	void returnStringNumberIsThreeMultipleTest() {
		Assertions.assertEquals("Fizz", app.isMultiple(21));
	}

	@Test
	void returnStringNumberIsFiveMultipleTest() {
		Assertions.assertEquals("Buzz", app.isMultiple(25));
	}
}
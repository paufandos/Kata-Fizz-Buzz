package com.fizzbuzz.tdd.tdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TddApplication {

	final int THREE_MULTIPLE = 3;
	final int FIVE_MULTIPLE = 5;
	final String FIZZ = "Fizz";
	final String BUZZ = "Buzz";
	final String FIZZ_BUZZ = "FizzBuzz";

	public static void main(String[] args) {
		SpringApplication.run(TddApplication.class, args);
	}

	public int getNumbers1to100() {
		int lastNumber = 0;
		for (int index = 1; index <= 100; index++) {
			System.out.println(index);
			lastNumber = index;

		}
		return lastNumber;
	}

	public int getNumber(int number) {
		System.out.println(number);
		return number;
	}

	public boolean isThreeMultiple(int number) {
		boolean result = false;
		if (getNumber(number) % THREE_MULTIPLE == 0) {
			result = true;
		}
		return result;
	}

	public void printResult(String result) {
		System.out.println(result);
	}

	public boolean isFiveMultiple(int number) {
		boolean result = false;
		if (getNumber(number) % FIVE_MULTIPLE == 0) {
			result = true;
		}
		return result;
	}

	public String isMultiple(int number) {
		String result = "";

		if (isThreeMultiple(number)) {
			printResult(FIZZ);
			result = FIZZ;
		}

		if (isFiveMultiple(number)) {
			printResult(BUZZ);
			result = BUZZ;
		}

		if (isFiveMultiple(number) && isThreeMultiple(number)) {
			printResult(FIZZ_BUZZ);
			result = FIZZ_BUZZ;
		}

		return result;
	}

}

package org.example;

public class Main {
	public static void main(String[] args) {
		run();
	}

	public static void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(compute(i));
		}
	}

	public static String compute(Integer n) {
		if (n % 3 == 0 && n % 5 != 0) return "Fizz";
		if (n % 3 != 0 && n % 5 == 0) return "Buzz";
		// noinspection ConstantValue -- I don't know what IntelliJ has smoked here, but I want one.
		if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz";
		return n.toString();
	}
}
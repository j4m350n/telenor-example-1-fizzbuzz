package org.example;

public class Runner {

	public void run(int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.println(compute(i));
		}
	}


	protected String compute(Integer n) {
		if (n % 3 == 0 && n % 5 != 0) return "Fizz";
		if (n % 3 != 0 && n % 5 == 0) return "Buzz";
		// noinspection ConstantValue -- I don't know what IntelliJ has smoked here, but I want one.
		if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz";
		return n.toString();
	}

}

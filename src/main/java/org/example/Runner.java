package org.example;

public class Runner {

	public void run(int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.println(compute(i));
		}
	}

	protected String compute(Integer n) {
		String out = "";
		if (n % 3 == 0) out += "Fizz";
		if (n % 5 == 0) out += "Buzz";
		if (n % 7 == 0) out += "Bazz";
		if (out.isEmpty()) out = n.toString();
		return out;
	}

}

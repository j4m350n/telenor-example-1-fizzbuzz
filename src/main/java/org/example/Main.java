package org.example;

public class Main {
	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.words.add(new Word("Fizz", 3));
		runner.words.add(new Word("Buzz", 5));
		runner.words.add(new Word("Bazz", 7));
		runner.run(1, 100);
	}
}
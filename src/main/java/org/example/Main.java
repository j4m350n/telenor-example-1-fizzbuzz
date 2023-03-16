package org.example;

import org.example.words.BazzWord;
import org.example.words.BuzzWord;
import org.example.words.FizzWord;

public class Main {
	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.words.add(new FizzWord());
		runner.words.add(new BuzzWord());
		runner.words.add(new BazzWord());
		runner.run(1, 100);
	}
}
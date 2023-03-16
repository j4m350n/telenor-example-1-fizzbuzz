package org.example;

public class Word {
	public final String word;
	public final Integer multipleOf;

	public Word(String word, Integer multipleOf) {
		this.word = word;
		this.multipleOf = multipleOf;
	}

	public boolean isAMultipleOf(Integer n) {
		return n % multipleOf == 0;
	}
}

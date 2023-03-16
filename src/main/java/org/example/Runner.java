package org.example;

import java.util.ArrayList;

public class Runner {

	public final ArrayList<Word> words = new ArrayList<>();

	public void run(int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.println(compute(i));
		}
	}

	protected String compute(Integer n) {
		final StringBuilder out = new StringBuilder();
		for (Word word : words) {
			if (word.isAMultipleOf(n)) out.append(word.word);
		}
		if (out.length() == 0) out.append(n.toString());
		return out.toString();
	}

}

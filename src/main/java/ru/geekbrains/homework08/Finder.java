package ru.geekbrains.homework08;

import java.util.*;

public abstract class Finder {
	public static void wordFinder(String[] arr) {
		int uniqueWordCount = 0;
		List<String> wordsSet = new ArrayList<>(
				Arrays.asList(arr)
		);
		while (!wordsSet.isEmpty()) {
			String word = wordsSet.get(0);
			int wordCount = 0;
			while (wordsSet.contains(word)) {
				wordsSet.remove(word);
				wordCount++;
			}
			uniqueWordCount++;
			System.out.println("'" + word + "': " + wordCount + " раз/а.");
		}
		System.out.println("Всего уникальных слов: " + uniqueWordCount);
	}
}

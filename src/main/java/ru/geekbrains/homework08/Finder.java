package ru.geekbrains.homework08;

import java.util.*;

public abstract class Finder {
	public static void wordFinder(String[] arr) {
		Map<String, Integer> wordsMap = new HashMap<>();
		for (String word : arr) {
			if (wordsMap.containsKey(word))
				wordsMap.put(word, (wordsMap.get(word) + 1));
			else
				wordsMap.put(word, 1);
		}
		System.out.println(wordsMap.toString());
		System.out.println("Всего уникальных слов: " + wordsMap.size());
	}
}

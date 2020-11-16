package ru.geekbrains.homework12;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson12 {
	public static void main(String[] args) throws FileNotFoundException {
		//первое
		String hundredWords = Stream.iterate("a", s -> s + "a")
				.limit(100)
				.collect(Collectors.joining(" "));

		String fiveCharWords = Stream.of(hundredWords)
				.flatMap(s -> Arrays.stream(hundredWords.split(" ")))
				.filter(s -> s.length() > 5)
				.collect(Collectors.joining(" "));

		System.out.println(fiveCharWords);

		//второе
		String[][] biStr = {
				{"ddd", "ddd", "ccc", "aaa", "eee"},
				{"ddd", "fff", "ccc", "ama", "eae"},
				{"add", "fhf", "ccc", "aaa", "eee"},
				{"ddd", "fff", "ccc", "aaa", "eee"},
				{"dad", "fff", "ccc", "aak", "eee"}
		};
		List<String> unique = Arrays.stream(biStr)
				.flatMap(s -> Arrays.stream(s).distinct())
				.distinct()
				.collect(Collectors.toList());

		System.out.println(unique.toString());

		//третье
		int sum = IntStream.range(100, 201)
				.filter(s -> s % 2 == 0)
				.sum();

		System.out.println(sum);

		//четвертое
		String[] str = {"ddd", "fff", "ccc", "aaa", "eee", "bbb"};
		int sumLength = Stream.of(str)
				.flatMapToInt(s -> IntStream.of(s.length()))
				.sum();

		System.out.println(sumLength);

		//пятое
		String firstWords = Stream.of(str)
				.sorted()
				.limit(3)
				.collect(Collectors.joining(" "));

		System.out.println(firstWords);
	}
}

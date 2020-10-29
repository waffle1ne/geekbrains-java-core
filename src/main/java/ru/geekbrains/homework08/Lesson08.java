package ru.geekbrains.homework08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lesson08 {
	public static void main(String[] args) throws FileNotFoundException {
		//Первое задание
		Scanner fileScanner = new Scanner(
				new File("src/main/resources/file/WordsFile.txt")
		).useDelimiter("\n");
		List<String> words = new ArrayList<>();
		while (fileScanner.hasNext())
			words.add(fileScanner.next());
		Finder.wordFinder(words.toArray(new String[0]));
		System.out.println();

		//Второе задание
		Phonebook phonebook = new Phonebook();
		phonebook.add("Ivanov", "+79150000001");
		phonebook.add("Petrov", "+79160000010");
		phonebook.add("Ivanov", "+79990000011");
		phonebook.add("Smith", "+79770000100");
		phonebook.add("Smith", "+79770000101");
		phonebook.add("Smith", "+79770000110");
		phonebook.get("Ivanov");
		System.out.println();
		phonebook.get("Petrov");
		System.out.println();
		phonebook.get("Smith");
	}
}

package ru.geekbrains.homework08;

import java.util.*;

public class Phonebook {
	HashMap<String, List<String>> phonebook = new HashMap<>();

	public void add(String surname, String phoneNumber) {
		List<String> value;
		if (phonebook.containsKey(surname))
			value = phonebook.get(surname);
		else
			value = new ArrayList<>();
		value.add(phoneNumber);
		phonebook.put(surname, value);
	}

	public void get(String surname) {
		System.out.println(phonebook.get(surname));
	}
}

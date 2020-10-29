package ru.geekbrains.homework08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Phonebook {
	ArrayList<List> phonebook = new ArrayList<>();

	public void add(String surname, String phoneNumber) {
		List<String> contact = new ArrayList<>(Arrays.asList(surname, phoneNumber));
		phonebook.add(contact);
	}

	public void get(String surname) {
		for (List<String> contact : phonebook) {
			if (contact.contains(surname)){
				System.out.println(contact.toArray()[1]);
			}
		}
	}
}

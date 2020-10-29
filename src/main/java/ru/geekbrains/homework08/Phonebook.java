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

	public static void main(String[] args) {
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

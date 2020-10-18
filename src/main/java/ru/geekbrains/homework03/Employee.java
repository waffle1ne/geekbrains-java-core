package ru.geekbrains.homework03;

import java.util.Objects;

public class Employee {

	private String name;
	private String email;
	private int age;
	private String rank;

	public Employee() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, email, age, rank);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		Employee employee = (Employee) obj;
		return age == employee.age && (name != null && name.equals(employee.getName()))
				&& (email != null && email.equals(employee.getEmail()))
				&& (rank != null && rank.equals(employee.getRank()));
	}

	public Employee(String name, int age, String email, String rank) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.rank = rank;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getRank() {
		return rank;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder();
		if (this.name != null)
			info.append("Имя: ").append(this.name);
		if (this.age != 0)
			info.append(", возраст: ").append(this.age);
		if (this.email != null)
			info.append(", email: ").append(this.email);
		if (this.rank != null)
			info.append(", должность: ").append(this.rank);
		return info.toString();
	}
}

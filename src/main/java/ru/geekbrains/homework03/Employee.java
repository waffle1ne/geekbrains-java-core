package ru.geekbrains.homework03;

public class Employee {

	private String name;
	private String email;
	private int age;
	private String position;

	public Employee(String name) {
		this.name = name;
	}

	public Employee(String name, int age, String... email_position) {
		this.name = name;
		this.age = age;
		if (email_position.length <= 2) {
			for (int i = 0; i < email_position.length; i++) {
				if (email_position[i].contains("e_"))
					this.email = email_position[i].substring(2);
				if (email_position[i].contains("p_"))
					this.position = email_position[i].substring(2);
			}
		}
	}

	public void info() {
		System.out.println("Name: " + this.name + ", age: "
				+ this.age + ", email: " + this.email + ", position: " + this.position);
	}

	public String getInfo() {
		StringBuilder info = new StringBuilder();
		if (this.name != null)
			info.append("Name: ").append(this.name);
		if (this.age != 0)
			info.append(", age: ").append(this.age);
		if (this.email != null)
			info.append(", email: ").append(this.email);
		if (this.position != null)
			info.append(", position: ").append(this.position);
		return info.toString();
	}

	public String getName() {
		return this.name;
	}
}

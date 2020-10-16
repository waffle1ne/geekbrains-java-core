package ru.geekbrains.homework03;

import java.util.Arrays;

public class Group {

	private String name;
	private Employee[] employees;
	private int MAX = 2;

	public Group(String name) {
		this.name = name;
	}

	public Group(String name, Employee[] employees) {
		this.name = name;
		if (employees.length > this.MAX) {
			System.out.println("В одном отделе может быть максимум 10 сотрудников");
		}
		this.employees = employees;
	}

	public void addEmployee(Employee... newEmployee) {
		if (this.employees == null)
			this.employees = new Employee[1];
		int countAddedEmployee = 0;
		for (int k = 0; k < newEmployee.length; k++) {
			for (int i = 0; i < this.employees.length; i++) {
				if (this.employees[i] == null) {
					this.employees[i] = newEmployee[k];
					System.out.println("В отдел " + this.name + " добавлен сотрудник " + newEmployee[k].getName());
					countAddedEmployee++;
					break;
				}
				if (i == this.employees.length - 1 && this.employees[i] != null && this.employees.length < this.MAX) {
					Employee[] newEmployees = new Employee[this.employees.length + 1];
					System.arraycopy(this.employees, 0, newEmployees, 0, this.employees.length);
					newEmployees[++i] = newEmployee[k];
					this.employees = newEmployees;
					System.out.println("В отдел " + this.name + " добавлен сотрудник " + newEmployee[k].getName());
					countAddedEmployee++;
					break;
				}
			}
		}
		if (countAddedEmployee != newEmployee.length)
			System.out.println("В этом отделе больше нет места. Сотрудник не добавлен");
	}

	public void delEmployeeByIndex(int index) {
		this.employees[index] = null;
		System.out.println("Сотрудник с индексом: " + index + " удалён из отдела " + this.name);
	}

	public void delEmployee(Employee employee) {
		for (int i = 0; i < this.employees.length; i++) {
			if (this.employees[i] != null && this.employees[i].equals(employee)){
				this.employees[i] = null;
				System.out.println("Сотрудник " + employee.getName() + " удалён из отдела " + this.name);
				return;
			}
		}
		System.out.println("Сотрудник с именем " + employee.getName() + " не состоит в отделе " + this.name);
	}

	public void delAllEmployees() {
		Arrays.fill(this.employees, null);
		System.out.println("Все сотрудники удалены из отдела " + this.name);
	}

	public void info() {
		int employeesCount = 0;
		StringBuilder employeesInfo = new StringBuilder();
		for (int i = 0; i < this.employees.length; i++)
			if (this.employees[i] != null) {
				employeesCount++;
				employeesInfo.append('\n').append(this.employees[i].getInfo());
			}
		System.out.println("В отделе: " + this.name + ", состоит "
				+ employeesCount + " сотрудник(а/ов): " + employeesInfo.toString());
	}
}

package ru.geekbrains.homework03;

import java.util.Arrays;

public class Group {

	private String name;
	private Employee[] employees;
	private static int MAX = 10;

	public Group() {
	}

	public Group(String name) {
		this.name = name;
		this.employees = new Employee[MAX];
	}

	private void validateEmployees(Employee[] employees) {
		int count = 0;
		for (Employee employee : this.employees) {
			if (employee == null)
				count++;
		}
		if (count < employees.length) {
			throw new IllegalArgumentException("В отделе свободно " + count + " мест");
		}
	}

	public void addEmployee(Employee... newEmployee) {
		validateEmployees(newEmployee);
		for (Employee employee : newEmployee) {
			for (int i = 0; i < employees.length; i++) {
				if (employees[i] == null) {
					employees[i] = employee;
					System.out.println("В отдел " + name + " добавлен сотрудник " + employee.getName());
					break;
				}
			}
		}
	}

	public void delEmployeeByIndex(int index) {
		if (!(index >= 0 && index < employees.length)){
			System.out.println("Некорректный индекс");
			return;
		}
		this.employees[index] = null;
		System.out.println("Сотрудник с индексом: " + index + " удалён из отдела " + this.name);
	}

	public void delEmployee(Employee employeeForDel) {
		if (employeeForDel == null)
			return;
		for (Employee employee : employees) {
			if (employeeForDel.equals(employee)){
				System.out.println("Сотрудник " + employee.getName() + " удалён из отдела " + this.name);
				employee = null;
				return;
			}
		}
		System.out.println("Сотрудник с именем " + employeeForDel.getName() + " не состоит в отделе " + this.name);
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
				employeesInfo.append('\n').append(this.employees[i].toString());
			}
		System.out.println("В отделе: " + this.name + ", состоит "
				+ employeesCount + " сотрудник(а/ов): " + employeesInfo.toString());
	}
}

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
		if (!(index >= 0 && index < employees.length)) {
			System.out.println("Некорректный индекс");
			return;
		}
		this.employees[index] = null;
		System.out.println("Сотрудник с индексом: " + index + " удалён из отдела " + name);
	}

	public void delEmployee(Employee employeeForDel) {
		if (employeeForDel == null)
			return;
		for (int i = 0; i < employees.length; i++) {
			if (employeeForDel.equals(employees[i])) {
				System.out.println("Сотрудник " + employees[i].getName() + " удалён из отдела " + name);
				employees[i] = null;
				return;
			}
		}
		System.out.println("Сотрудник с именем " + employeeForDel.getName() + " не состоит в отделе " + name);
	}

	public void delAllEmployees() {
		Arrays.fill(employees, null);
		System.out.println("Все сотрудники удалены из отдела " + name);
	}

	public String getInfo() {
		int employeesCount = 0;
		StringBuilder employeesInfo = new StringBuilder();
		for (Employee employee : employees)
			if (employee != null) {
				employeesCount++;
				employeesInfo.append('\n').append(employee.toString());
			}
		return "В отделе: " + name + ", состоит "
				+ employeesCount + " сотрудник(а/ов): " + employeesInfo.toString();
	}
}

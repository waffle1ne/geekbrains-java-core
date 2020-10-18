package ru.geekbrains.homework03;

public class Lesson03 {
	public static void main(String[] args) {
		Employee oleg = new Employee("Олег", 24,
				"oleg@email.ru", "Стажёр");
		System.out.println(oleg.toString());
		System.out.println("");

		Employee igor = new Employee("Игорь", 28, "", "Разработчик");
		Group backOffice = new Group("Бэк-офис");
		backOffice.addEmployee(oleg, igor);
		System.out.println(backOffice.getInfo());
		System.out.println("");

		Employee ivan = new Employee("Иван", 30, "", "");
		backOffice.addEmployee(ivan);
		backOffice.delEmployee(ivan);
		System.out.println(backOffice.getInfo());
		System.out.println("");

		backOffice.delAllEmployees();
		System.out.println(backOffice.getInfo());
		System.out.println("");

		Group frontOffice = new Group("Фронт-офис");
		frontOffice.addEmployee(oleg, igor, ivan);
		frontOffice.delEmployee(igor);
		frontOffice.delEmployeeByIndex(0);
		Employee georg = new Employee("Георгий", 35, "", "");
		frontOffice.delEmployee(georg);
		System.out.println(frontOffice.getInfo());
	}
}

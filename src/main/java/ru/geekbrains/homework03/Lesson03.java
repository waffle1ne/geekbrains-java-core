package ru.geekbrains.homework03;

public class Lesson03 {
	public static void main(String[] args) {
		Employee Oleg = new Employee("Олег", 24,
				"e_oleg@email.ru", "p_Стажёр");
		Oleg.info();
		System.out.println("");

		Employee[] developers = new Employee[2];
		developers[0] = Oleg;
		Employee Igor = new Employee("Игорь", 28, "p_Разработчик");
		developers[1] = Igor;
		Group backOffice = new Group("Бэк-офис", developers);
		backOffice.info();
		System.out.println("");

		Employee Ivan = new Employee("Иван", 30);
		backOffice.addEmployee(Ivan);
		backOffice.info();
		System.out.println("");

		backOffice.delAllEmployees();
		backOffice.info();
		System.out.println("");

		Group frontOffice = new Group("Фронт-офис");
		frontOffice.addEmployee(Oleg, Igor, Ivan);
		frontOffice.delEmployee(Igor);
		frontOffice.delEmployeeByIndex(1);
		Employee Georg = new Employee("Георгий");
		frontOffice.delEmployee(Georg);
		frontOffice.info();
	}
}

package ru.geekbrains.homework04;

public class Cat implements Participant {
	public boolean jump(int height) {
		int jump = 1;
		if (jump >= height) {
			System.out.println("Кот перепрыгнул");
			return true;
		}
		else {
			System.out.println("Кот не перепрыгнул!");
			return false;
		}
	}

	public boolean run(int length) {
		int run = 5;
		if (run >= length) {
			System.out.println("Кот пробежал");
			return true;
		}
		else {
			System.out.println("Кот не пробежал!");
			return false;
		}
	}
}

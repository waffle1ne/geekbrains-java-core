package ru.geekbrains.homework04;

public class Robot implements Participant {
	public boolean jump(int height) {
		int jump = 3;
		if (jump >= height) {
			System.out.println("Робот перепрыгнул");
			return true;
		}
		else {
			System.out.println("Робот не перепрыгнул!");
			return false;
		}
	}

	public boolean run(int length) {
		int run = 15;
		if (run >= length) {
			System.out.println("Робот пробежал");
			return true;
		}
		else {
			System.out.println("Робот не пробежал!");
			return false;
		}
	}
}


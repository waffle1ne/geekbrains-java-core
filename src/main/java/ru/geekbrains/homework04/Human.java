package ru.geekbrains.homework04;

public class Human implements Participant {
	public boolean jump(int height) {
		int jump = 2;
		if (jump >= height) {
			System.out.println("Человек перепрыгнул");
			return true;
		}
		else {
			System.out.println("Человек не перепрыгнул!");
			return false;
		}
	}

	public boolean run(int length) {
		int run = 10;
		if (run >= length) {
			System.out.println("Человек пробежал");
			return true;
		}
		else {
			System.out.println("Человек не пробежал!");
			return false;
		}
	}
}

package ru.geekbrains.homework04;

public class Human implements Participant {
	private static final int MAX_JUMP = 2;
	private static final int MAX_RUN = 10;

	public boolean jump(int height) {
		if (MAX_JUMP >= height) {
			System.out.println("Человек перепрыгнул");
			return true;
		} else {
			System.out.println("Человек не перепрыгнул!");
			return false;
		}
	}

	public boolean run(int length) {
		if (MAX_RUN >= length) {
			System.out.println("Человек пробежал");
			return true;
		} else {
			System.out.println("Человек не пробежал!");
			return false;
		}
	}
}

package ru.geekbrains.homework04;

public class Cat implements Participant {
	private static final int MAX_JUMP = 1;
	private static final int MAX_RUN = 5;

	public boolean jump(int height) {
		if (MAX_JUMP >= height) {
			System.out.println("Кот перепрыгнул");
			return true;
		} else {
			System.out.println("Кот не перепрыгнул!");
			return false;
		}
	}

	public boolean run(int length) {
		if (MAX_RUN >= length) {
			System.out.println("Кот пробежал");
			return true;
		} else {
			System.out.println("Кот не пробежал!");
			return false;
		}
	}
}

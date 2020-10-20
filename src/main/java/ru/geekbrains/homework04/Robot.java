package ru.geekbrains.homework04;

public class Robot implements Participant {
	private static final int MAX_JUMP = 3;
	private static final int MAX_RUN = 15;

	public boolean jump(int height) {
		if (MAX_JUMP >= height) {
			System.out.println("Робот перепрыгнул");
			return true;
		} else {
			System.out.println("Робот не перепрыгнул!");
			return false;
		}
	}

	public boolean run(int length) {
		if (MAX_RUN >= length) {
			System.out.println("Робот пробежал");
			return true;
		} else {
			System.out.println("Робот не пробежал!");
			return false;
		}
	}
}


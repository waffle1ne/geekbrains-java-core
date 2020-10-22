package ru.geekbrains.homework04;

import ru.geekbrains.homework05.CanJump;
import ru.geekbrains.homework05.CanRun;

public class Cat implements Participant, CanRun, CanJump {
	private final String name;
	private final int jumpDistance;
	private final int runDistance;

	public Cat(String name, int jumpDistance, int runDistance) {
		this.name = name;
		this.jumpDistance = jumpDistance;
		this.runDistance = runDistance;
	}

	public String getName() {
		return name;
	}

	public int getJumpDistance() {
		return jumpDistance;
	}

	public int getRunDistance() {
		return runDistance;
	}

	@Override
	public boolean jump(int height) {
		if (jumpDistance >= height) {
			System.out.println("Кот перепрыгнул");
			return true;
		} else {
			System.out.println("Кот не перепрыгнул!");
			return false;
		}
	}

	@Override
	public boolean run(int length) {
		if (jumpDistance >= length) {
			System.out.println("Кот пробежал");
			return true;
		} else {
			System.out.println("Кот не пробежал!");
			return false;
		}
	}

	@Override
	public void sad() {
		System.out.println(name + ": 'мяу ;-('(с)...");
	}
}

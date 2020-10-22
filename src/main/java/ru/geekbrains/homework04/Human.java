package ru.geekbrains.homework04;

import ru.geekbrains.homework05.CanSwim;
import ru.geekbrains.homework05.CanRun;
import ru.geekbrains.homework05.CanJump;

public class Human implements CanSwim, CanRun, CanJump, Participant {
	private final String name;
	private final int jumpDistance;
	private final int runDistance;
	private final int swimDistance;

	public Human(String name, int jumpDistance, int runDistance, int swimDistance) {
		this.jumpDistance = jumpDistance;
		this.runDistance = runDistance;
		this.swimDistance = swimDistance;
		this.name = name;
	}

	public int getJumpDistance() {
		return jumpDistance;
	}

	public int getRunDistance() {
		return runDistance;
	}

	public int getSwimDistance() {
		return swimDistance;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean jump(int height) {
		if (jumpDistance >= height) {
			System.out.println(name + " перепрыгнул");
			return true;
		} else {
			System.out.println(name + " НЕ перепрыгнул!");
			return false;
		}
	}

	@Override
	public boolean run(int length) {
		if (runDistance >= length) {
			System.out.println(name + " пробежал");
			return true;
		} else {
			System.out.println(name + " НЕ пробежал!");
			return false;
		}
	}

	@Override
	public boolean swim(int distance) {
		if (swimDistance >= distance) {
			System.out.println(name + " переплыл");
			return true;
		} else {
			System.out.println(name + " НЕ переплыл!");
			return false;
		}
	}

	@Override
	public void sad() {
		System.out.println(name + ": расстроен...");
	}
}

package ru.geekbrains.homework04;

import ru.geekbrains.homework05.CanFly;
import ru.geekbrains.homework05.CanJump;
import ru.geekbrains.homework05.CanRun;
import ru.geekbrains.homework05.CanSwim;

public class Robot implements Participant, CanJump, CanRun, CanSwim, CanFly {
	private final String name;
	private final int jumpDistance;
	private final int runDistance;
	private final int swimDistance;
	private final int flyDistance;

	public Robot(String name, int jumpDistance, int runDistance, int swimDistance, int flyDistance) {
		this.name = name;
		this.jumpDistance = jumpDistance;
		this.runDistance = runDistance;
		this.swimDistance = swimDistance;
		this.flyDistance = flyDistance;
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
	public boolean fly(int distance) {
		if (flyDistance >= distance) {
			System.out.println(name + " перелетел");
			return true;
		} else {
			System.out.println(name + " НЕ перелетел!");
			return false;
		}
	}

	@Override
	public void sad() {
		System.out.println(name + ": 'бип-бип'(с)...");
	}
}


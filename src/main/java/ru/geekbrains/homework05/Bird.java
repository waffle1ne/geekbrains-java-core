package ru.geekbrains.homework05;

import ru.geekbrains.homework04.Participant;

public class Bird implements CanFly, Participant {
	private final int flyDistance;
	private final String name;

	public Bird(String name, int flyDistance) {
		this.flyDistance = flyDistance;
		this.name = name;
	}

	public int getFlyDistance() {
		return flyDistance;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean fly(int distance) {
		if (flyDistance >= distance) {
			System.out.println(name + " перелетела");
			return true;
		} else {
			System.out.println(name + " НЕ перелетела!");
			return false;
		}
	}

	@Override
	public void sad() {
		System.out.println(name + ": 'чирик-чирик'(с)...");
	}
}

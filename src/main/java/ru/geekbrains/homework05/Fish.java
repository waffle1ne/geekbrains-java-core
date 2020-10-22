package ru.geekbrains.homework05;

import ru.geekbrains.homework04.Participant;

public class Fish implements CanSwim, Participant {
	private final int swimDistance;
	private final String name;

	public Fish(String name, int swimDistance) {
		this.swimDistance = swimDistance;
		this.name = name;
	}

	public int getSwimDistance() {
		return swimDistance;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean swim(int distance) {
		if (swimDistance >= distance) {
			System.out.println(name + " переплыла");
			return true;
		} else {
			System.out.println(name + " НЕ перепрыла!");
			return false;
		}
	}

	@Override
	public void sad() {
		System.out.println(name + ": 'буль буль'(c)");
	}
}

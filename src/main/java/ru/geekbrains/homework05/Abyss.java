package ru.geekbrains.homework05;

import ru.geekbrains.homework04.Obstacle;

public class Abyss implements Obstacle {
	private final int distance;

	public Abyss(int distance) {
		this.distance = distance;
	}

	public int getDistance() {
		return distance;
	}
}

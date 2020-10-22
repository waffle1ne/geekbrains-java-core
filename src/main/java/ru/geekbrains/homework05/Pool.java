package ru.geekbrains.homework05;

import ru.geekbrains.homework04.Obstacle;

public class Pool implements Obstacle {
	private final int distance;

	public Pool(int distance) {
		this.distance = distance;
	}

	public int getDistance() {
		return distance;
	}
}

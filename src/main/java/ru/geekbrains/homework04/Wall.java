package ru.geekbrains.homework04;

public class Wall implements Obstacle {
	private final int distance;

	public Wall(int distance) {
		this.distance = distance;
	}

	public int getDistance() {
		return distance;
	}
}

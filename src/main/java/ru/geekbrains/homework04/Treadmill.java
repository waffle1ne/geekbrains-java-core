package ru.geekbrains.homework04;

public class Treadmill implements Obstacle {
	private final int distance;

	public Treadmill(int distance) {
		this.distance = distance;
	}

	public int getDistance() {
		return distance;
	}
}

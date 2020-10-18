package ru.geekbrains.homework04;

import java.util.Objects;

public class Obstacles {
	String name;
	int height;
	int length;

	public Obstacles() {
	}

	public Obstacles(String name, int height, int length) {
		this.name = name;
		this.height = height;
		this.length = length;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, height, length);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		Obstacles obstacle = (Obstacles) obj;
		return height == obstacle.height
				&& length == obstacle.length
				&& (name != null && name.equals(obstacle.getName()));
	}

	@Override
	public String toString() {
		return "Name: " + name
				+ " height: " + height
				+ " length: " + length;
	}
}

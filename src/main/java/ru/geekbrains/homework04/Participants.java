package ru.geekbrains.homework04;

import java.util.Objects;

public class Participants {
	String name;
	int jump;
	int run;

	public Participants() {
	}

	public Participants(String name, int jump, int run) {
		this.name = name;
		this.jump = jump;
		this.run = run;
	}

	public boolean jump(int height) {
		return this.jump >= height && this.jump > 0;
	}

	public boolean run(int length) {
		return this.run >= length && this.run > 0;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setJump(int jump) {
		this.jump = jump;
	}

	public int getJump() {
		return jump;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public int getRun() {
		return run;
	}

	@Override
	public String toString() {
		return "Name: " + name
				+ " run: " + run
				+ " jump: " + jump;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, jump, run);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		Participants participant = (Participants) obj;
		return jump == participant.jump
				&& run == participant.run
				&& (name != null && name.equals(participant.getName()));
	}
}

package ru.geekbrains.homework05;

import ru.geekbrains.homework04.*;

public class Lesson05 {
	public static void main(String[] args) {
		Obstacle[] obstacles = {
				new Treadmill(5),
				new Wall(2),
				new Pool(5),
				new Abyss(10)
		};
		Participant[] participants = {
				new Fish("Рыбка", 10),
				new Bird("Птичка", 10),
				new Human("Саня", 2, 10, 15),
				new Cat("Кот", 1, 5),
				new Robot("0x000010", 3, 15, 15, 5)
		};
		for (Participant participant : participants) {
			for (Obstacle ob : obstacles) {
				if (!race(participant, ob))
					break;
			}
		}
	}

	public static boolean race(Participant pt, Obstacle ob) {
		if (ob instanceof Treadmill) {
			Treadmill treadmill = (Treadmill) ob;
			if (pt instanceof CanRun) {
				CanRun canRly = (CanRun) pt;
				return canRly.run(treadmill.getDistance());
			}
		}
		if (ob instanceof Wall) {
			Wall wall = (Wall) ob;
			if (pt instanceof CanJump) {
				CanJump canJump = (CanJump) pt;
				return canJump.jump(wall.getDistance());
			}
		}
		if (ob instanceof Abyss) {
			Abyss abyss = (Abyss) ob;
			if (pt instanceof CanFly) {
				CanFly canFly = (CanFly) pt;
				return canFly.fly(abyss.getDistance());
			}
		}
		if (ob instanceof Pool) {
			Pool pool = (Pool) ob;
			if (pt instanceof CanSwim) {
				CanSwim canSwim = (CanSwim) pt;
				return canSwim.swim(pool.getDistance());
			}
		}
		pt.sad();
		System.out.println("... и покидает гонку");
		return false;
	}
}
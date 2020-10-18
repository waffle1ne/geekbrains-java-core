package ru.geekbrains.homework04;

public class Lesson04 {
	public static void main(String[] args) {
		Obstacles[] obstacles = {new Wall("Забор", 2),
				new Treadmill("Дорожка", 10)};
		Participants[] participants = {new Robot("0x000001"),
				new Cat("Барсик", 10),
				new Human("Лёха", 4, 20)};
			for (Participants participant : participants) {
				for (Obstacles obstacle : obstacles) {
					if (participant.run(obstacle.length) && obstacle.length != 0)
						System.out.println(participant.name + " пробежал препятствие " + obstacle.name);
					else if (participant.jump(obstacle.height) && obstacle.height != 0)
						System.out.println(participant.name + " перепрыгнул препятствие " + obstacle.name);
					else{
						System.out.println(participant.name + " не преодолел препятствие " + obstacle.name);
						break;
					}
				}
			}
	}
}

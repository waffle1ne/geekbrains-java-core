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
					if (participant.run(obstacle.getLength()) && obstacle.getLength() != 0)
						System.out.println(participant.getName() + " пробежал препятствие " + obstacle.getName());
					else if (participant.jump(obstacle.getHeight()) && obstacle.getHeight() != 0)
						System.out.println(participant.getName() + " перепрыгнул препятствие " + obstacle.getName());
					else{
						System.out.println(participant.getName() + " не преодолел препятствие " + obstacle.getName());
						break;
					}
				}
			}
	}
}

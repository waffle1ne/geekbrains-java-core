//package ru.geekbrains.homework04;
//
//public class Lesson04 {
//	public static void main(String[] args) {
//		Participant[] participants = {
//				new Cat(),
//				new Human(),
//				new Robot()
//		};
//		Obstacle[] obstacles = {
//				new Treadmill(),
//				new Wall()
//		};
//		for (Participant participant : participants) {
//			for (Obstacle obstacle : obstacles) {
//				if (obstacle instanceof Wall) {
//					Wall wall = (Wall) obstacle;
//					if (!participant.jump(wall.getHeight()))
//						break;
//				}
//				if (obstacle instanceof Treadmill) {
//					Treadmill treadmill = (Treadmill) obstacle;
//					if (!participant.run(treadmill.getLength()))
//						break;
//				}
//			}
//		}
//	}
//}

package ru.geekbrains.homework02;

import java.util.Arrays;

public class Exercise05 {
	public static void main(String[] args) {
		Lesson02 lesson02 = new Lesson02();
		int[] array = {1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(array));
		lesson02.scrambleArray(array);
		System.out.println(Arrays.toString(array));
	}
}

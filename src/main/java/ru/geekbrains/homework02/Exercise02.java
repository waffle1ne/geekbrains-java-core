package ru.geekbrains.homework02;

import java.util.Arrays;

public class Exercise02 {
	public static void main(String[] args) {
		Lesson02 lesson02 = new Lesson02();
		int[] array = {2, 5, 3, 6, 1, -8, 12, 0};
		System.out.print(Arrays.toString(array) + " -> ");
		lesson02.selectionSort(array);
		System.out.println(Arrays.toString(array));
	}
}

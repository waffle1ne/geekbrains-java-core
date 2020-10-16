package ru.geekbrains.homework02;

import java.util.Arrays;
import java.util.Random;

public class Lesson02 {

	public void triangle(int size, char symbol) {
		if (size % 2 == 0 && size != 0) {
			System.out.println("Укажите нечётный размер основания треугольника");
			return;
		}
		if (size <= 0) {
			System.out.println("Укажите размер основания треугольника больше нуля");
			return;
		}
		int y = (size + 1) / 2;
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < size; j++) {
				if (j >= (size - y) - i && j <= (size - y) + i)
					System.out.print(symbol);
				else
					System.out.print(' ');
			}
			System.out.println("");
		}
	}

	public void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min_index = i;
			int min = array[i];
			for (int j = i; j < array.length; j++) {
				if (min > array[j]) {
					min = array[j];
					min_index = j;
				}
			}
			int tmp = array[i];
			array[i] = min;
			array[min_index] = tmp;
		}
	}

	public String timerSec(int time) {
		int sec = time % 60;
		int min = time / 60 >= 60 ? (time / 60) % 60 : time / 60;
		int hour = time / 3600;
		String[] tmp = new String[3];
		tmp[0] = hour / 10 == 0 ? ("0" + hour) : Integer.toString(hour);
		tmp[1] = min / 10 == 0 ? (".0" + min) : "." + min;
		tmp[2] = sec / 10 == 0 ? (".0" + sec) : "." + sec;
		return (tmp[0] + tmp[1] + tmp[2]);
	}

	public void revArray(int[] array) {
		int tmp;
		int j = array.length - 1;
		for (int i = 0; i < j; i++) {
			tmp = array[i];
			array[i] = array[j];
			array[j--] = tmp;
		}
	}

	public void scrambleArray(int[] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			int tmp_index = random.nextInt(array.length);
			int tmp = array[i];
			array[i] = array[tmp_index];
			array[tmp_index] = tmp;
		}
	}
}

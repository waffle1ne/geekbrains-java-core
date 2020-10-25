package ru.geekbrains.homework06;

public class Lesson06 {
	public static void main(String[] args) {
		String[][] array = {
				{"1", "2", "3", "4"},
				{"1", "2", "3", "4"},
				{"1", "2", "3", "4"},
				{"1", "2", "3", "4"}
		};
		try {
			System.out.println(cubeArraySum(array));
		} catch (MyArraySizeException | MyArrayDataException e) {
			e.printStackTrace();
		}
	}

	public static int cubeArraySum(String[][] array) throws MyArrayDataException, MyArraySizeException {
		int result = 0;
		for (String[] strings : array) {
			if (strings.length != 4 || array.length != 4) {
				throw new MyArraySizeException("Array mast be 4x4 size");
			}
		}
		for (int y = 0; y < array.length; y++) {
			for (int x = 0; x < array[y].length; x++) {
				try {
					result += Integer.parseInt(array[y][x]);
				} catch (NumberFormatException e) {
					throw new MyArrayDataException("'" + array[y][x]
							+ "' not a number. It stores in: array[" + y + "][" + x + "]");
				}
			}
		}
		return result;
	}
}

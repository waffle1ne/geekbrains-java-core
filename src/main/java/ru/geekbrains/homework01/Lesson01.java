package ru.geekbrains.homework01;

import java.util.Arrays;
import java.util.Random;

public class Lesson01 {

    public boolean isTenTwenty(int num1, int num2) { //returns true if sum of numbers located in between 10 and 20;
        return (num1 + num2 >= 10 && num1 + num2 < 20);
    }

    public void whatNumSign(int num) { //print what sign is number;
        if (num >= 0)
            System.out.println("Положительное");
        else
            System.out.println("Отрицательное");
    }

    public boolean isNumNegative(int num) { //returns true if the number is negative;
        return (num < 0);
    }

    public void helloName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public void fiveEx() { //first its make an array with zero and one, next reverse it;
        int[] array = makeOneZeroArray(12);
        System.out.print(Arrays.toString(array) + " -> ");
        int[] revArray = revArray(array);
        System.out.println(Arrays.toString(revArray));
    }

    public int[] makeOneZeroArray(int max) {
        int[] array = new int[max];
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt((1) + 1);
        return (array);
    }

    public int[] revArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                newArray[i] = 1;
            if (array[i] == 1)
                newArray[i] = 0;
        }
        return (newArray);
    }

    public int[] makeTwoPlusThreeProgressArray() { //makes an array that starts with two and then adds three to next in progress
        int[] array = new int[8];
        array[0] = 2;
        for (int i = 1; i < array.length; i++)
            array[i] = array[i - 1] + 3;
        return (array);
    }

    public int[] multiplyByTwoIfUnderSix(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
        return (array);
    }

    public void squareLeftHalfCross(int side) { //makes a square from an array with a half-cross from '1' and print it
        int[][] twoDimArray = new int[side][side];
        for (int i = 0; i < twoDimArray.length; i++)
            twoDimArray[i][i] = 1;
        System.out.println(Arrays.toString(twoDimArray[0]));
        for (int x = 1; x < twoDimArray.length; x++)
            System.out.println("   " + Arrays.toString(twoDimArray[x]));
    }

    public void nineEx(int size) { //makes random array, print it and max, min values
        int max;
        int min;
        int[] array = makeRandomArray(size);
        System.out.print(Arrays.toString(array) + " -> ");
        min = array[0];
        max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
        }
        System.out.print("min = " + min + "; ");
        System.out.println("max = " + max);
    }

    public int[] makeRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt();
        return (array);
    }

    public void isLeap(int year) {
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0)
            System.out.println("НЕ Високосный");
        else
            System.out.println("Високосный");
    }

    public boolean checkBalance(int[] array) {
        int l = 0;
        int r = array.length - 1;
        int left = array[l];
        int right = array[r];
        while (r - l != 1) {
            if (left >= right)
                right += array[--r];
            else
                left += array[++l];
        }
        return (left == right);
    }

    public int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++)
            min = Math.min(min, array[i]);
        return (min);
    }
}

package ru.geekbrains.homework01;

import java.util.Arrays;

public class Balance {
    public static void main(String[] args) {
        Lesson01 func = new Lesson01();
        int[] array1 = {1, 2, 2, 5, -10, 10};
        int[] array2 = {1, 2, 4, 5, 5, -9, 6};
        boolean what = func.checkBalance(array1);
        if (what)
            System.out.println(Arrays.toString(array1) + ": Сбалансированный");
        else
            System.out.println(Arrays.toString(array1) + ": Не сбалансированный");;

    }
}

package ru.geekbrains.homework07;

public class Lesson07 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(
                new Apple[]{
                        new Apple(),
                        new Apple(),
                        new Apple()
                }
        );
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(
                new Orange[]{
                        new Orange(),
                        new Orange()
                }
        );

        Apple apple = new Apple();
        Orange orange = new Orange();
        String compare = appleBox.compare(orangeBox) ? "Да" : "Нет!";

        System.out.printf("Яблоко весит: %f, Апельсин весит: %f\n" +
                        "Коробка яблок весит: %f, Коробка апельсин весит: %f\n" +
                        "Коробки равны? Ответ: %s\n",
                apple.getWeight(), orange.getWeight(), appleBox.getWeight(), orangeBox.getWeight(),
                compare);

        Box<Apple> appleBox1 = new Box<>();
        appleBox.moveTo(appleBox1);

        System.out.printf("Переложили яблоки в другую коробку. Вес первой коробки: %f, второй: %f",
                appleBox.getWeight(), appleBox1.getWeight());

    }
}

package ru.geekbrains.homework07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private final List<T> list = new ArrayList<>();

    public void add(T[] fruits) {
        list.addAll(Arrays.asList(fruits));
    }

    public double getWeight() {
        if (list.size() == 0)
            return 0;
        double boxWeight = 0;
        for (T fruit : list) {
            boxWeight += fruit.getWeight();
        }
        return boxWeight;
    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }

    public void moveTo(Box<T> box) {
        box.list.addAll(list);
        list.clear();
    }
}

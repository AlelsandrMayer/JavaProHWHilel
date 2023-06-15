package net.hliznutsa.hw17.fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void addFruits(List<T> fruits) {
        this.fruits.addAll(fruits);
    }

    public float getWeight() {
        float totalWeight = 0.0f;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> anotherBox) {
        return getWeight() == anotherBox.getWeight();
    }


    public void merge(Box<T> anotherBox) {
        if (this == anotherBox) {
            return;
        }
        fruits.addAll(anotherBox.fruits);
        anotherBox.fruits.clear();
    }
}

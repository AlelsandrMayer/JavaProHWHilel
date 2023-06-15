package net.hliznutsa.hw17.fruits;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();

        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple());
        appleList.add(new Apple());
        appleList.add(new Apple());

        appleBox1.addFruits(appleList);


        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес appleBox2: " + appleBox2.getWeight());
        System.out.println("Вес orangeBox: " + orangeBox.getWeight());

        System.out.println("Равны ли appleBox1 и appleBox2 по весу? " + appleBox1.compare(appleBox2));
        System.out.println("Равны ли appleBox1 и orangeBox по весу? " + appleBox1.compare(orangeBox));

        appleBox1.merge(appleBox2);
        System.out.println("Вес appleBox1 после объединения: " + appleBox1.getWeight());
        System.out.println("Вес appleBox2 после объединения: " + appleBox2.getWeight());
    }
}





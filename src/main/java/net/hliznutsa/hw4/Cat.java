package net.hliznutsa.hw4;

public class Cat extends Animal {
    private static int count = 0;

    public Cat(String name) {
        super(name);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.err.println(name + " не может пробежать больше 200 м");
        }
    }

    @Override
    public void swim(int distance) {
        System.err.println(name + " не умеет плавать");
    }
}
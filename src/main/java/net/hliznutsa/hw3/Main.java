package net.hliznutsa.hw3;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Джеки Чан");
        Cat catMurzik = new Cat("Персик");

        dogBobik.run(150);
        catMurzik.run(250);

        dogBobik.swim(5);
        catMurzik.swim(5);

        System.out.println("Создано " + Dog.getCount() + " собак, " + Cat.getCount() + " котов, всего " + (Dog.getCount() + Cat.getCount()) + " животных");
    }
}
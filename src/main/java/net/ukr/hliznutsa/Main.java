package net.ukr.hliznutsa;

import static net.ukr.hliznutsa.Car.start;

public class Main {
    public static void main(String[] args) {
        start();
        Employee employee1 = new Employee("Марк Иван Иванович ", "Специалист", "vasilek@gmail.com", "+380667778899", 44);
        System.out.println(employee1.getFullName());
    }
}

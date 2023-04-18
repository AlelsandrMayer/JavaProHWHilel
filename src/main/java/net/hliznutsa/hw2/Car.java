package net.hliznutsa.hw2;

public class Car {

    public static void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private static void startElectricity() {
        System.out.println("Запуск электрической системы автомобиля.");
    }

    private static void startCommand() {
        System.out.println("Запуск командной системы автомобиля.");
    }

    private static void startFuelSystem() {
        System.out.println("Запуск топливной системы автомобиля.");
    }
}

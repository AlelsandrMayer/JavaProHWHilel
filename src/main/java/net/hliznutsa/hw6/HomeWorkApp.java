package net.hliznutsa.hw6;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("-------------------------");

        checkSumSign();
        System.out.println("-------------------------");

        printColor();
        System.out.println("-------------------------");

        compareNumbers();
        System.out.println("-------------------------");

        System.out.println(checkNumbers(5, 14));
        System.out.println("-------------------------");

        isPositive(-1);
        System.out.println("-------------------------");

        System.out.println(isNegative(1));
        System.out.println("-------------------------");

        counter("Hillel", 5);
        System.out.println("-------------------------");

        System.out.println(checkYear(2024));
    }

    public static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }

    public static void checkSumSign() {
        int a = 2423;
        int b = -2344;
        int result = a + b;

        if (result >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }


    public static void compareNumbers() {
        int a = 21;
        int b = -22;
        System.out.println((a >= b ? "a >= b" : "a < b"));
    }

    public static boolean checkNumbers(int a, int b) {
        int result = a + b;
        return result >= 10 && result <= 20;
    }

    public static void isPositive(int num) {
        if (num >= 0) {
            System.out.println("Додатнє число");
        } else {
            System.out.println("Від’ємне число");
        }
    }

    public static boolean isNegative(int num) {
        return num <= 0;
    }

    public static void counter(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean checkYear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return year % 4 == 0;
    }
}

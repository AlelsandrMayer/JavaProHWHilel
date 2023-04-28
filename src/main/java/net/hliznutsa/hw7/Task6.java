package net.hliznutsa.hw7;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Привествуем в игре 'УГАДАЙ СЛОВО', игра продолжается пока слово не будет угадано. \n Ваше слово: \n");

        int randomNumber = random.nextInt(words.length);
        String randomWord = words[randomNumber];
        String userWord;

        do {
            userWord = scanner.next();
            if (!userWord.matches("[a-z]+")) {
                System.out.println("Только маленькие буквы и латиница! Введите слово ещё раз:");
            } else if (userWord.equals(randomWord)) {
                System.out.println("ПОБЕДА!!! Вы угадали.");
            } else {
                System.out.println("Неудача :( Попробуйте ввести слово ещё раз. \nПодсказка: загаданное слово начинается  так: "
                        + randomWord.charAt(0) + randomWord.charAt(1) + "###############");
            }
        } while (!userWord.equals(randomWord));
    }
}
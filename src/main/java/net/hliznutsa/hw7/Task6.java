package net.hliznutsa.hw7;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Привествуем в игре 'УГАДАЙ СЛОВО', игра продолжается пока слово не будет угадано. \n Ваше слово: \n");

        int randomNumber = random.nextInt(words.length);
        String randomWord = words[randomNumber];
        StringBuilder hint = new StringBuilder("###############");
        String userWord;

        do {
            userWord = scanner.next();
            if (!userWord.matches("[a-z]+")) {
                System.out.println("Только маленькие буквы и латиница! Введите слово ещё раз:");
            } else if (userWord.equals(randomWord)) {
                System.out.println("ПОБЕДА!!! Вы угадали.");
            } else {
                for (int i = 0; i < userWord.length() && i < randomWord.length(); i++) {
                    if (userWord.charAt(i) == randomWord.charAt(i)) {
                        hint.setCharAt(i, randomWord.charAt(i));
                    }
                }
                System.out.println("Неудача :( Попробуйте ввести слово ещё раз. \nПодсказка: " + hint);
            }
        } while (!userWord.equals(randomWord));
    }
}
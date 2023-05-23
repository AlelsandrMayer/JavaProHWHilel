package net.hliznutsa.hw12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "apple", "orange", "apple", "apple", "banana", "apple", "orange", "apple");
        String targetString = "apple";
        int occurrenceCount = countOccurance(stringList, targetString);
        System.out.println("Совпадений со словом " + targetString + " равно : " + occurrenceCount);

        //-------------------------------------------------------------------

        int[] array = {1, 3, 4, 5, 6};
        List<Integer> listTo = toList(array);
        System.out.println(listTo);

        //-------------------------------------------------------------------

        List<Integer> listFind = Arrays.asList(3, 2, 5, 6, 8, 3, 2, 6, 7, 2, 3, 1, 3, 2);
        List<Integer> newListFind = findUnique(listFind);
        System.out.println(newListFind);

        //-------------------------------------------------------------------

        calcOccurance(stringList);

        //-------------------------------------------------------------------

        List<WordOccurrence> occurrences = findOccurance(stringList);
        for (WordOccurrence occurrence : occurrences) {
            System.out.println(occurrence.toString());
        }


    }

    public static int countOccurance(List<String> stringList, String targetString) {
        int count = 0;
        for (String str : stringList) {
            if (str.equals(targetString)) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> toList(int[] array) {
        List<Integer> list = new LinkedList<>();
        for (int value : array) {
            list.add(value);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        return uniqueNumbers;
    }

    public static void calcOccurance(List<String> stringList) {
        List<String> uniqueWords = findUniqueString(stringList);

        for (String word : uniqueWords) {
            int count = countOccurance(stringList, word);
            System.out.println(word + ": " + count);
        }
    }

    public static List<WordOccurrence> findOccurance(List<String> stringList) {
        List<String> uniqueWords = findUniqueString(stringList);
        List<WordOccurrence> occurrences = new ArrayList<>();

        for (String word : uniqueWords) {
            occurrences.add(new WordOccurrence(word, countOccurance(stringList, word)));
        }
        return occurrences;
    }

    public static List<String> findUniqueString(List<String> stringList) {
        List<String> uniqueWords = new ArrayList<>();

        for (String word : stringList) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }
        return uniqueWords;
    }
}


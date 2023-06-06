package net.hliznutsa.hw15;

public class CocktailSort {
    public static void cocktailSort(int[] array) {
        cocktailSort(array, 0, array.length - 1);
    }

    private static void cocktailSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        for (int i = start; i < end; i++) {
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1);
            }
        }

        for (int i = end - 1; i >= start; i--) {
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1);
            }
        }

        cocktailSort(array, start + 1, end - 1);
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


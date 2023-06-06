package net.hliznutsa.hw15;

import java.util.Arrays;

import static net.hliznutsa.hw15.CocktailSort.cocktailSort;
import static net.hliznutsa.hw15.QuickSort.quickSort;

public class Main {
    public static void main(String[] args) {
        int[] arrQuickSort = {7, 2, 1, 6, 8, 5, 3, 4};

        System.out.println("Исходный массив, quickSort: " + "\n" + Arrays.toString(arrQuickSort));

        quickSort(arrQuickSort);

        System.out.println("Отсортированный массив, quickSort: " + "\n" + Arrays.toString(arrQuickSort));


        //--------------------------------------------------------------


        int[] arrCocktailSort = {5, 3, 8, 2, 1, 4};
        System.out.println("Исходный массив, cocktailSort: " + "\n" + Arrays.toString(arrCocktailSort));

        cocktailSort(arrCocktailSort);

        System.out.println("Отсортированный массив, cocktailSort: " + "\n" + Arrays.toString(arrCocktailSort));
    }
}
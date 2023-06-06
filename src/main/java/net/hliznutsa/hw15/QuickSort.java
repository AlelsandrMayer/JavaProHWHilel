package net.hliznutsa.hw15;

public class QuickSort {

    public static void quickSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
            //Базовый случай
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int middleIndex = partition(arr, low, high);

            quickSort(arr, low, middleIndex - 1);
            quickSort(arr, middleIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int middle = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= middle) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


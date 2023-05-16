package net.hliznutsa.hw10;

import java.util.Arrays;

public class ValueCalculator {
    private double[] arr;
    private int size;
    private int halfSize;

    public ValueCalculator(int size) {
        if (size < 1000000) {
            size = 1000000;
        }

        this.size = size;
        this.halfSize = this.size / 2;
        this.arr = new double[this.size];
    }

    public void startAndWriteArr() throws InterruptedException {
        long start = System.currentTimeMillis();

        Arrays.fill(this.arr, 1.0f);

        double[] firstHalfArr = new double[this.halfSize];
        double[] secondHalfArr = new double[this.halfSize];

        System.arraycopy(arr, 0, firstHalfArr, 0, this.halfSize);
        System.arraycopy(arr, this.halfSize, secondHalfArr, 0, this.halfSize);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < firstHalfArr.length; i++) {
                firstHalfArr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < secondHalfArr.length; i++) {
                secondHalfArr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        thread2.start();

        thread1.join();
        thread2.join();

        System.arraycopy(firstHalfArr, 0, arr, 0, this.halfSize);

        System.arraycopy(secondHalfArr, 0, arr, this.halfSize, this.halfSize);

        long end = System.currentTimeMillis();

        System.out.println("Программа выполнена за " + (end - start) + " миллисекунд");

    }
}
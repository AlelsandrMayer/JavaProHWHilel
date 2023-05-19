package net.hliznutsa.hw11;

import java.util.concurrent.Semaphore;

class PetrolStation {
    private volatile int amount;
    private Semaphore semaphore;

    public PetrolStation(int initialAmount) {
        this.amount = initialAmount;
        this.semaphore = new Semaphore(3);
    }

    public void doRefuel(int requestedAmount) throws InterruptedException {
        semaphore.acquire();

        System.out.println("Запрос на заправку " + requestedAmount + " литров. Доступно " + this.amount + " литров.");

        Thread.sleep((int) (Math.random() * 8000 + 3000));
        this.amount -= requestedAmount;

        System.out.println("Заправка на " + requestedAmount + " литров выполнена. Остаток топлива: " + this.amount + " литров.");

        semaphore.release();
    }
}
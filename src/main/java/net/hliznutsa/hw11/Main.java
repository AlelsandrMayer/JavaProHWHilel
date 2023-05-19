package net.hliznutsa.hw11;

public class Main {
    public static void main(String[] args) {
        PetrolStation station = new PetrolStation(500);

        for (int i = 1; i <= 5; i++) {
            int requestedAmount = (int) (Math.random() * 50);

            new Thread(() -> {
                try {
                    station.doRefuel(requestedAmount);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }).start();
        }
    }
}



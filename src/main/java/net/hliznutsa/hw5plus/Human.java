package net.hliznutsa.hw5plus;

public class Human implements Participant {
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Human(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run() {
        System.out.println("-----Человек побежал!-----");
    }

    @Override
    public void jump() {
        System.out.println("-----Человек прыгает!-----");
    }

    @Override
    public String getName() {
        return "Человек";
    }

    @Override
    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }
}

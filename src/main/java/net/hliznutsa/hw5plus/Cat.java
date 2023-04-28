package net.hliznutsa.hw5plus;

public class Cat implements Participant {
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Cat(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run() {
        System.out.println("-----Кот побежал!-----");
    }

    @Override
    public void jump() {
        System.out.println("-----Кот прыгнул!-----");
    }

    @Override
    public String getName() {
        return "Кот";
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

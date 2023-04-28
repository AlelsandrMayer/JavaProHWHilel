package net.hliznutsa.hw5plus;

public class Robot implements Participant {
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Robot(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run() {
        System.out.println("-----Робот побежал!-----");
    }

    @Override
    public void jump() {
        System.out.println("-----Робот прыгнул!-----");
    }

    @Override
    public String getName() {
        return "Робот";
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

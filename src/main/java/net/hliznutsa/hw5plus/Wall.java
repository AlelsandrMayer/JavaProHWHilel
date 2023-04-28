package net.hliznutsa.hw5plus;

public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.jump();
        return participant.getMaxJumpHeight() >= height;
    }

    @Override
    public String getName() {
        return "стена";
    }

    @Override
    public int getValue() {
        return height;
    }
}

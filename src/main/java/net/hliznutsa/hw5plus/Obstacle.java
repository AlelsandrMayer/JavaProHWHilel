package net.hliznutsa.hw5plus;

public interface Obstacle {
    boolean overcome(Participant participant);

    String getName();

    int getValue();
}

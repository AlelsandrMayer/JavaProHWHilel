package net.hliznutsa.hw5plus;

public interface Participant {
    void run();

    void jump();

    String getName();

    int getMaxRunDistance();

    int getMaxJumpHeight();
}

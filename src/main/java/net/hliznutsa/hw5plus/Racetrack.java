package net.hliznutsa.hw5plus;

public class Racetrack implements Obstacle {
    private final int distance;

    public Racetrack(int distance) {
        this.distance = distance;
    }


    @Override
    public boolean overcome(Participant participant) {
        participant.run();
        return participant.getMaxRunDistance() >= distance;
    }

    @Override
    public String getName() {
        return "беговая дорожка";
    }

    @Override
    public int getValue() {
        return distance;
    }
}

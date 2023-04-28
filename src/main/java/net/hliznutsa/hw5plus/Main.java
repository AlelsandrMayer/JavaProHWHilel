package net.hliznutsa.hw5plus;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = new Participant[]{
                new Human(500, 2),
                new Cat(400, 3),
                new Robot(1000, 5)
        };

        Obstacle[] obstacles = new Obstacle[]{
                new Racetrack(500),
                new Wall(3)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle.overcome(participant)) {
                    System.out.println("Учасник " + participant.getName() + ", прошёл препятствие " + obstacle.getName() + " на дистанции " + obstacle.getValue());
                } else {
                    System.out.println("Учасник " + participant.getName() + ", не прошёл препятствие " + obstacle.getName() + " на дистанции " + obstacle.getValue() + ". "
                            + "Пройдено - " + ((obstacle instanceof Racetrack) ? participant.getMaxRunDistance() : participant.getMaxJumpHeight()));
                    break;
                }
            }
        }
    }
}


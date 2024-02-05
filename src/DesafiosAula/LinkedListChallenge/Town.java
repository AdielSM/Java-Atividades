package DesafiosAula.LinkedListChallenge;

public class Town {
    private final String name;
    private final int distanceFromSidney;

    public Town(String name, int distanceFromSidney) {
        this.name = name;
        this.distanceFromSidney = distanceFromSidney;
    }

    public String getName() {
        return name;
    }

    public int getDistanceFromSidney() {
        return distanceFromSidney;
    }

    @Override
    public String toString() {
        return name + " - " + distanceFromSidney + "km from Sidney";
    }
}

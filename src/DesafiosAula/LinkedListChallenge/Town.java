package DesafiosAula.LinkedListChallenge;

public record Town(String name, int distanceFromSidney) {
    @Override
    public String toString() {
        return name + " - " + distanceFromSidney + "km from Sidney";
    }
}

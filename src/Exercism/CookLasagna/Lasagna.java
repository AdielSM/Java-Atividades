package Exercism.CookLasagna;

public class Lasagna {

    private final int MINUTES_IN_OVEN = 40;
    private final int LAYER_MINUTES = 2;
    public int expectedMinutesInOven() {
        return MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * LAYER_MINUTES;
    }

    public int totalTimeInMinutes(int layers, int actualMinutesInOven) {
        return preparationTimeInMinutes(layers) + actualMinutesInOven;
    }
}

package DesafiosAula.PolymorphismChallenge;

public class Vehicle {
    private String description;

    public Vehicle(String description) {
        this.description = description;
    }
    public String startEngine() {
        return "Starting engine...";
    }

    public String drive() {
        String result = "Driving...";
        result += "\n" + runEngine();
        return result;
    }

    protected String runEngine() {
        return "Engine running...";
    }

    public String getDescription() {
        return description;
    }

}

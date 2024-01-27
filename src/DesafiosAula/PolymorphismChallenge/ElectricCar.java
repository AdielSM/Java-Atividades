package DesafiosAula.PolymorphismChallenge;

public class ElectricCar extends  Vehicle {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public String startEngine() {
        return this.getClass().getSimpleName() + " -> " + super.startEngine();
    }

    @Override
    public String drive() {
        String result = this.getClass().getSimpleName() + " -> " + "Driving...";
        result += "\n" + runEngine();
        return result;
    }

    @Override
    protected String runEngine() {
        return this.getClass().getSimpleName() + " -> " + super.runEngine();
    }
}


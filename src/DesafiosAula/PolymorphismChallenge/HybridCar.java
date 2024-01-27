package DesafiosAula.PolymorphismChallenge;
/*
The HybridCar class has the following attributes:

one field called avgKmPerLiter of type double.
one field called batterySize of type int.
one field called cylinders of type int.
 */

public class HybridCar extends Vehicle{
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
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

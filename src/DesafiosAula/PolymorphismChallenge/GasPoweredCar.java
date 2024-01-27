package DesafiosAula.PolymorphismChallenge;

public class GasPoweredCar extends Vehicle{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
        return this.getClass().getSimpleName() + " -> " +  super.startEngine();
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

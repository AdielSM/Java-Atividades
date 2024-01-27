package CodePractices.Polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        return  this.getClass().getSimpleName() +  " engine has started...";
    }

    public String accelerate(){
        return this.getClass().getSimpleName() + " is accelerating...";
    }

    public String brake(){
        return this.getClass().getSimpleName() + " car is braking...";
    }

    public String getName(){
        return name;
    }

    public int getCylinders(){
        return cylinders;
    }
}

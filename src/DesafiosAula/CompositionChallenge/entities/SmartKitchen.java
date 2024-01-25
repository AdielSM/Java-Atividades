package DesafiosAula.CompositionChallenge.entities;

public class SmartKitchen {
    private final Refrigerator refrigerator = new Refrigerator();
    private final CoffeMaker coffeMaker = new CoffeMaker();
    private final DishWasher dishWasher = new DishWasher();

    public SmartKitchen(){}

    public void setKitchenState(boolean refrigerator, boolean CoffeMaker, boolean dishWasher) {
        this.refrigerator.setWasWorkToDo(refrigerator);
        this.coffeMaker.setWasWorkToDo(CoffeMaker);
        this.dishWasher.setWasWorkToDo(dishWasher);

        System.out.println("The kitchen is ready to work.");
    }

    public void doKitchenWork(){
        refrigerator.orderFood();
        coffeMaker.brewCoffee();
        dishWasher.doDishes();
    }
}

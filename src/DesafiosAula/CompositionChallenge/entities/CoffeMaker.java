package DesafiosAula.CompositionChallenge.entities;

class CoffeMaker {
    private boolean wasWorkToDo;
    public CoffeMaker(){}

    public void setWasWorkToDo(boolean wasWorkToDo) {
        this.wasWorkToDo = wasWorkToDo;
    }

    public void brewCoffee(){
        if (wasWorkToDo) {
            System.out.println("- The coffee maker prepared the coffee.");
            this.wasWorkToDo = false;
        } else {
            System.out.println("- The coffee maker didn't prepare the coffee " +
                    "because nothing was asked of her.");
        }
    }
}

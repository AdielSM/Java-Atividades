package DesafiosAula.CompositionChallenge.entities;

class DishWasher {
    private boolean wasWorkToDo;
    public DishWasher(){}

    public void setWasWorkToDo(boolean wasWorkToDo) {
        this.wasWorkToDo = wasWorkToDo;
    }

    public void doDishes(){
        if (wasWorkToDo) {
            System.out.println("- The dishwasher washed the dishes.");
            this.wasWorkToDo = false;
        } else {
            System.out.println("- The dishwasher didn't wash the dishes " +
                    "because nothing was asked of her.");
        }
    }
}

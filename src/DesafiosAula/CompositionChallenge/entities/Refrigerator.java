package DesafiosAula.CompositionChallenge.entities;

class Refrigerator {
    private boolean wasWorkToDo;
    public Refrigerator(){}

    public void setWasWorkToDo(boolean wasWorkToDo) {
        this.wasWorkToDo = wasWorkToDo;
    }

    public void orderFood(){
        if (wasWorkToDo) {
            System.out.println("- The refrigerator got the food.");
            this.wasWorkToDo = false;
        } else {
            System.out.println("- The refrigerator didn't get the food " +
                    "because nothing was asked of her.");
        }
    }
}

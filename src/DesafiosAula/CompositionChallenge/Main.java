package DesafiosAula.CompositionChallenge;

import DesafiosAula.CompositionChallenge.entities.SmartKitchen;

public class Main {
    public static void main(String[] args) {
        SmartKitchen smartKitchen = new SmartKitchen();
        smartKitchen.setKitchenState(false, true, true);
        smartKitchen.doKitchenWork();
    }
}

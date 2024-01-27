package DesafiosAula.PolymorphismChallenge;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new GasPoweredCar("Gas Powered Car", 10, 4);
        vehicles[1] = new ElectricCar("Electric Car", 100, 100);
        vehicles[2] = new HybridCar("Hybrid Car", 10, 100, 4);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getDescription());
            System.out.println(vehicle.startEngine());
            System.out.println(vehicle.drive());
            System.out.println();
        }
    }
}

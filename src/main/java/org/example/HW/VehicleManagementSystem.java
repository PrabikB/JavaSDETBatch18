package org.example.HW;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        Car c = new Car("Toyota","4Runner","Full Tank");
        c.startEngine();
        c.stopEngine();
        c.fuelLevel();

        System.out.println("**************************");

        Truck t = new Truck("Ford","F150","Low");
        t.fuelLevel();
        t.stopEngine();
        t.fuelLevel();

        System.out.println("*************************");

        Motorcycle m = new Motorcycle("Harley Davidson","Soft Tail", "Avergae level ");
        m.startEngine();
        m.stopEngine();
        m.fuelLevel();
    }


}

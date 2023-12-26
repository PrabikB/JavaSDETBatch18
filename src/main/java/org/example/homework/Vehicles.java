package org.example.homework;

public class Vehicles {
    /*Create a class named Vehicle. If no arguments are passed while creating an object of the class,
    it should print "I love vehicles". If a String representing the type of vehicle (like "Car", "Bike")
    is passed, it should print "I love [VehicleType]". For example, if "Car" is passed, it should print "I love Car"
     */

    String vehicleType;
public Vehicles(){
    System.out.println("I love vehicles");
}
public Vehicles(String vehicleType){
    this.vehicleType = vehicleType;
    System.out.println("I love " + vehicleType);
    }
}

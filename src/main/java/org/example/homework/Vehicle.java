package org.example.homework;

public class Vehicle {
    /* Vehicle Hierarchy Task: Create a class Vehicle with subclasses like Car, Truck, Motorcycle, and Bicycle.
Define common attributes like speed, color, and fuelType in the Vehicle class.
Override methods in the subclasses, like accelerate and brake, with specific behaviors.
Add unique methods in subclasses, like loadCargo in Truck.
Instantiate objects of each subclass and store them in an array.
Iterate through the array to demonstrate polymorphism.
     */
    private int speed;
    private String color;
    private String fuelType;
    public Vehicle (int speed, String color, String fuelType){
        this.speed = speed;
        this.color = color;
        this.fuelType = fuelType;
    }
    public void printInfo(){
        System.out.println(speed+" mph "+color+" "+fuelType);
    }
    public void accelerate(){
        System.out.println("Speeding fast");
    }
    public void brake(){
        System.out.println("Braking");
    }
}
class Car extends Vehicle{
    public Car(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }
    public void printInfo(){
        super.printInfo();
    }
    public void accelerate(){
        System.out.println("Speeding fast");
    }
    public void brake(){
        System.out.println("car is stopping");
    }
}
class Truck extends Vehicle{
    public Truck(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }
    public void loadcargo(){
        System.out.println("Truck is loading a cargo");
    }
    public void accelerate(){
        System.out.println("Truck is accelerating.");
    }
    public void brake(){
        System.out.println("Truck is braking to stop");
    }
}
class Motorcycle extends Vehicle{
    public Motorcycle(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }
    public void accelerate(){
        System.out.println("Bike is going faster");
    }
    public void stunt(){
        System.out.println("Motorcycle is performing a stunt");
    }
}
class Bicycle extends Vehicle{
    public Bicycle(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }
    public void brake(){
        System.out.println("Bicycle is stopping");
    }
    public void ringBell(){
        System.out.println("Bicycle is ringing a bell");
    }
}

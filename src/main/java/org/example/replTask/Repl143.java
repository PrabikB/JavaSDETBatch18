package org.example.replTask;

public class Repl143 {
    /* 1. Complete the Car.java class:
Create the following variable (**Choose proper datatype**)
* make
* model
* numberOfDoors
* topSpeed
* price
following the proper naming convention for variables.
Write four constructors:
* The first constructor(with all parameters)
* A secondary constructor Have all parameters **except numberOfDoors.
(**numberOfDoors value should assign to 4 inside constructor)
* A third constructor Have all parameters **except make and model .
** **(**make and model value should assign to "unknown" inside constructor)
* A fourth constructor Have all parameters **except topSpeed and price**;
**(**topSpeed value should assign to "90" and price value should be assign to 0 inside constructor)
Create a display method in Cars class to print the class variable value in console.
2. Test your code with the Main.java class:
Create several Car objects using all Constructors.
then call display method with each object.
Output:
Toyota Prius 4 120 30000.0
Toyota Prius 4 120 30000.0
unknown unknown 4 120 30000.0
Toyota Prius 4 90 0.0
     */
    private String make;
    private String model;
    private int numberOfDoors;
    private int topSpeed;
    private double price;
    public Repl143(String make, String model, int numberOfDoors, int topSpeed, double price){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    public Repl143(String make, String model, int topSpeed, double price){
        int numberOfDoors = 4;
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;
        this.numberOfDoors = numberOfDoors;
    }
    public Repl143(int numberOfDoors, int topSpeed, double price){
        String make = "unknown";
        String model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
        this.make = make;
        this.model = model;
    }
    public Repl143(String make, String model,int numberOfDoors ) {
        int topSpeed = 90;
        double price = 0;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    public void displayInfo(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }
}
class CarTester{
    public static void main(String[] args) {
        Repl143 car = new Repl143("Toyota","Camry",4,180,45000);
        car.displayInfo();
        Repl143 car2 = new Repl143("Lexus","GX460",200, 85000);
        car2.displayInfo();
        Repl143 car3 = new Repl143(4,120,30000);
        car3.displayInfo();
        Repl143 car4 = new Repl143("Honda","CRV",4);
        car4.displayInfo();
    }
}



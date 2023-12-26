package org.example.replTask;

public class Repl87Main {
    /*Create a class named 'Main' with specific attributes.
Create two objects of that class in which you will be assigning the following values and then print them.
-carColor='Black'
-carYear=2019
-carMake='BMW'
-carColor='White'
-carYear=2018
-carMake='Toyota'
**Expected Output:**
Car color is Black and car year is 2019 and car model is BMW
Car color is White and car year is 2018 and car model is Toyota
     */
    String carColor;
    String carMake;
    int carYear;

    public static void main(String[] args) {
        Repl87Main vehicle = new Repl87Main();
        vehicle.carColor = "Black";
        vehicle.carYear = 2019;
        vehicle.carMake = "BMW";
        System.out.println("Car color is "+ vehicle.carColor+ " and car year is "+vehicle.carYear+" and car model is "+vehicle.carMake);

        vehicle.carColor = "White";
        vehicle.carYear = 2018;
        vehicle.carMake = "Toyota";
        System.out.println("Car color is "+ vehicle.carColor+ " and car year is "+vehicle.carYear+" and car model is "+vehicle.carMake);

    }

}

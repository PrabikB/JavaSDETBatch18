package org.example.class16;

public class MultilevelTester {
    public static void main(String[] args) {
        Audi a = new Audi();
        a.color = "White";
    }

}

class Vehicle{
    String color;
}

class Car extends Vehicle{
    int noOfDoors = 4;

}

class Audi extends Car{

}
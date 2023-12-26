package org.example.class10;

public class CarTester {
    public static void main(String[] args) {

        // Creating an object from the class

        Car myCar = new Car();

        myCar.make = "Lexus";
        myCar.model = "GX460";
        myCar.price = 80000;
        myCar.color = "Black";
        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println(myCar.price);
        System.out.println(myCar.color);



        myCar.honk();
        myCar.ApplyBreak();
        myCar.drive();



    }
}

package org.example.homework;

public class VehicleTestingHierarchy {
    public static void main(String[] args) {
        Vehicle[] vArr = {new Car(90,"White","Regular"),
        new Truck(65,"Black","Diesel"),
        new Motorcycle(70,"Blue","Regular"),
        new Bicycle(10,"Green","battery")};

        for (int i = 0; i < vArr.length; i++) {
            Vehicle v = vArr[i];
            v.printInfo();
            v.accelerate();
            v.brake();

            if(v instanceof Truck){
                ((Truck) v).loadcargo();
            } else if (v instanceof Motorcycle) {
                ((Motorcycle) v).stunt();
            } else if (v instanceof Bicycle) {
                ((Bicycle) v).ringBell();
            }
            System.out.println("********************");
        }
    }
}

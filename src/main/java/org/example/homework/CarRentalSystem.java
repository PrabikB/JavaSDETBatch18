package org.example.homework;

public class CarRentalSystem {
    public static void main(String[] args) {
        LuxuryCar lux = new LuxuryCar("Lexus","LX600",2023);
        lux.printInfo();
        lux.calculateRentalPrice(5,449.99,100);
        System.out.println("***********************************************");
        EconomyCar eco = new EconomyCar("Toyota","Corolla",2023);
        eco.printInfo();
        eco.calculateRentalPrice(7,125.99);
    }
}

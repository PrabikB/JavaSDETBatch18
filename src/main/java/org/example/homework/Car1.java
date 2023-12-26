package org.example.homework;

public class Car1 {
    /*Car Rental System:
1)Create a class Car with properties like make, model, and year.
Implement a method calculate_rental_price based on the number of rental days.
Create two subclasses: LuxuryCar and EconomyCar. Override the calculate_rental_price
 method in LuxuryCar to include additional charges.
Demonstrate the functionality by creating instances of each class and calling their methods
     */
    private String make;
    private String model;
    private int year;

    public Car1(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void printInfo() {
        System.out.println("CarBrand : " + make + "   CarModel : " + model + "   MakeYear : " + year);
    }

    public void calculateRentalPrice(int day, double ratePerDay) {
        double totalprice = day * ratePerDay;
        System.out.println("The total price for " + day + " days for this car is $" + totalprice);
    }
}

class LuxuryCar extends Car1{
    public LuxuryCar(String make, String model, int year) {
        super(make, model, year);
    }
    public void calculateRentalPrice(int day,double ratePerDay, double additionalCharge){
        double totalPrice = (day*ratePerDay)+additionalCharge;
        System.out.println("The total price for "+day+ " days for this luxury car is $" +totalPrice);
    }
}

class EconomyCar extends Car1{
    public EconomyCar(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void calculateRentalPrice(int day, double ratePerDay) {
        super.calculateRentalPrice(day, ratePerDay);
    }
}




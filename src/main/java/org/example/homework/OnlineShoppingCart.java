package org.example.homework;

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Product p = new Product("MacBook Pro",1999.99,1);
        p.printInfo();
        p.calculateTotalPrice();

        System.out.println();
        System.out.println("*****Buy 2 MacBook Pro and get 15% discount*****");
        System.out.println();

        DiscountedProduct discountP = new DiscountedProduct("MacBook Pro",1999.99,2,15.0);
        discountP.printInfo();
        discountP.calculateTotalPrice();
    }
}

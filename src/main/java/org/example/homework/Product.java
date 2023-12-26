package org.example.homework;

public class Product {
    /*Online Shopping Cart:
Construct a class Product with attributes like product_name, price, and quantity.
Create a subclass DiscountedProduct that extends Product and includes an additional discount_rate attribute.
Override a method in DiscountedProduct to calculate the price after applying the discount.
Create instances of both classes and show how prices are calculated
     */
    private String productName;
     double price;
     int quantity;

    public Product(String productName,double price,int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public void printInfo(){
        System.out.println("Product name : "+productName+"   Price : "+price+"   quantity : "+quantity);
    }
    public void calculateTotalPrice(){
        double totalPrice = price * quantity;
        System.out.println("Total price of the product is $" +totalPrice);
    }
}

class DiscountedProduct extends Product{
    private double discountRate;
    public DiscountedProduct(String productName, double price, int quantity,double discountRate) {
        super(productName, price, quantity);
        this.discountRate = discountRate;
    }

    @Override
    public void calculateTotalPrice() {
        double discountedPrice = price * (1 - discountRate / 100);
        double totalPrice = discountedPrice * quantity;
        System.out.println("Total price after " +discountRate+"% discount is $" +totalPrice);
    }
}

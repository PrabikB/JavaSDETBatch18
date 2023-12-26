package org.example.replTask;

public class Repl148 {
    /* **In ShoppingStore class:**
Create variables as below.
- item,
- price,
- quantity
Create a constructor to initialize instance variables.
Create a method with name itemTotalPrice.
write a logic to to calculate the total price of items in stock. and print the result.
return the total value.
**In Main Class.**
Create two Object of ShoppingStore and pass the parameters to Constructor.
then using each object call the method itemTotalPrice.
Store the returned value of each object.
Calculate sum of both object and print the result.
Output:
Blanket Total Value 99.98
Mattress Total Value 439.18
You purchased 539.16 Today
Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,  This Keyword, Method Creation, Mathematic Operations, method return types.
     */

    private String item;
    private double price;
    private int quantity;

    public Repl148(String item,double price,int quantity){
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }
    public double itemTotalPrice(){
       double totalPrice = price * quantity;
        System.out.println(item+" Total Value "+totalPrice);
        return totalPrice;
    }

    public static void main(String[] args) {
        Repl148 s1 = new Repl148("Blanket", 99.98,1);
        double s1TotalValue =s1.itemTotalPrice();
        Repl148 s2= new Repl148("Mattress",439.18,1);
        double s2TotalValue = s2.itemTotalPrice();

        double totalPurchase = s1TotalValue+s2TotalValue;

        System.out.println("You purchased "+ totalPurchase +" Today");
    }
}

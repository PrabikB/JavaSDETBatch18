package org.example.replTask;

public class Repl144 {
    /* Step 1: Complete the StoreProduct.java class:
Create below instance variables. (Choose proper datatype and naming convention for variable )
* label
* price
* category
* hasExpiration
* stock (represent the stock quantity)
Step 2: Write three constructors:
* The main constructor( with all parameters)
* Second constructor with all parameters except category and hasExpiration
(category defaults to "misc", hasExpiration defaults to false inside constructor)
* Third constructor all the parameters except category, expiration, and stock
(stock default to 0 inside the constructor)
Step 3: Method for display out put.
in StoreProduct Class create a method to display the output of class variables.
(Output sequence as as order of variable shown above. all in one line)
Step 4: in Main Class Create an object of StoreProduct Class with each constructors.
pass the values and then call the display method.
Step 5: Execute your application :)
Hint: each variable must be object specific
Output:
Eggs 3.0 Produce true 10
Paper Towels 2.0 misc false 24
Paper Towels 2.0 null false 0
     */

    private String label;
    private double price;
    private String category;
    private boolean hasExpiration;
    private int stock;

    public Repl144(String label, double price, String category, boolean hasExpiration, int stock){
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }
    public Repl144(String label,double price, int stock){
        this.label = label;
        this.price = price;
        this.stock = stock;
        this.category = "misc";
        this.hasExpiration = false;
    }
    public Repl144(String label, double price){
        this.label = label;
        this.price = price;
        this.stock = 0;
    }
    public void displayInfo(){
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
    }

    public static void main(String[] args) {
        Repl144 storeProduct = new Repl144("Eggs",3,"Produce",true,10);
        storeProduct.displayInfo();
        Repl144 s2 = new Repl144("Paper Towels",2,24);
        s2.displayInfo();
        Repl144 s3 = new Repl144("Paper Towels",2);
        s3.displayInfo();
    }
}

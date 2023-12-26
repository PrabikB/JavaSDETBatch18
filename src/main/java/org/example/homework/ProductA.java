package org.example.homework;

/*E-Commerce System Task: Build a Product class with subclasses like Electronics, Clothing, Furniture, and Books.
Define attributes like price, name, and SKU in the Product class.
Override methods such as calculateTax based on product category.
Introduce unique methods like applyWarranty in Electronics.
Create objects of each subclass, store them in an array, and loop through to display or calculate prices and taxes.
 */
public class ProductA {
    private double price;
    private String name;
    private String SKU;
    public ProductA(double price,String name,String SKU){
        this.price = price;
        this.name = name;
        this.SKU = SKU;
    }
    public void productInfo(){
        System.out.println("Product name : "+name+"     Price : $"+price+"     SKU : "+SKU);
    }
    public double calculateTax(){
        return 0.08 * price;
    }
    public double getPrice(){
        return price;
    }
}
class Electronics extends ProductA{
    public Electronics(double price, String name, String SKU) {
        super(price, name, SKU);
    }
    @Override
    public double calculateTax() {
        return super.calculateTax();
    }
    public void applyWarranty(){
        System.out.println("2 years of warranty");
    }
}
class Clothing extends ProductA{
    public Clothing(double price, String name, String SKU) {
        super(price, name, SKU);
    }
    @Override
    public double calculateTax() {
        return 0.5 * getPrice();
    }
}
class Furniture extends ProductA{
    public Furniture(double price, String name, String SKU) {
        super(price, name, SKU);
    }
    @Override
    public double calculateTax() {
        return 0.07 * getPrice();
    }
}
class Books extends ProductA{
    public Books(double price, String name, String SKU) {
        super(price, name, SKU);
    }
    @Override
    public double calculateTax() {
        return 0.06 * getPrice();
    }
}

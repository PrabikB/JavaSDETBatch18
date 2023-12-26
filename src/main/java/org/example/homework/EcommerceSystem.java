package org.example.homework;

public class EcommerceSystem {
    public static void main(String[] args) {
        Electronics e = new Electronics(649.99,"Xbox One X","X123456");
        e.productInfo();
        e.calculateTax();
        e.applyWarranty();

        System.out.println("********************");

        Clothing c = new Clothing(60.99,"Nike Jogger","NK1010");
        c.productInfo();
        c.calculateTax();

        System.out.println("********************");

        Furniture f = new Furniture(7999.99,"Winston Sectional Lether Couch","VC0023456789");
        f.productInfo();
        f.calculateTax();
    }
}

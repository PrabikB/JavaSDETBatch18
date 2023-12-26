package org.example.class14;

public class Cat {
    //instance variable
    String name =  "Kitty"; // second priority
    void printName(){
        //loca variable
        String name = "Easter"; //first priority
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.printName();
    }
}

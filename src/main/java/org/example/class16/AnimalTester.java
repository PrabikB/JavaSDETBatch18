package org.example.class16;

public class AnimalTester {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.name = "Leo";
        d.color = "White";
        d.age= 2;
        d.weight = 15;
        d.printInfo();
        d.bark();

        Cat c = new Cat();
        c.name = "Easter";
        c.color = "White";
        c.age= 1;
        c.weight = 10;
        c.sleep();
        c.printInfo();
    }
}

package org.example.class21;

public class AnimalTester {
    public static void main(String[] args) {

        Cat c = new Cat("Easter","White");
        c.printInfo();
        c.eat();
        c.speak();
        c.sleep();

        System.out.println();

        Animal c2 = new Cat("Easter","White");
        c2.printInfo();
        c2.eat();

        System.out.println();

        Animal[] arr = {new Cat("Easter","White"),new Dog("Kanchu","Black")};
        for(Animal a : arr){
            a.printInfo();
            a.eat();
            a.sleep();
            a.speak();
        }

    }
}

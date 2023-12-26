package org.example.class10;

public class DogTester {
    public static void main(String[] args) {
        // Creating an object of the class
        Dog dog1 = new Dog();

        /*
        Dog => Data type
        dog1 => is variable that holds the object
        new Dog(); => Creating the object of Dog class
         */

        dog1.name = "Neo";
        dog1.breed = "Newfoundland";
        dog1.weight = 45;
        dog1.color = "Black";
        dog1.age = 2;

        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.weight);
        System.out.println(dog1.color);
        System.out.println(dog1.age);

        dog1.bark();
        dog1.sleep();

        Dog dog2 = new Dog();

        dog2.name = "Niko";
        dog2.breed = "German";
        dog2.weight = 18;
        dog2.color = "White";
        dog2.age = 5;

        System.out.println(dog2.name);
        System.out.println(dog2.breed);
        System.out.println(dog2.weight);
        System.out.println(dog2.color);
        System.out.println(dog2.age);

        dog2.eat();
        dog2.bark();
        dog2.sleep();



    }
}

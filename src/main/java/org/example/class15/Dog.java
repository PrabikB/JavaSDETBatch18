package org.example.class15;

public class Dog {

    private String name;
    private String breed;
    private String color;
    private int age;

    Dog(String dName, String dBreed, String dColor, int dAge){
        name = dName;
        breed = dBreed;
        color = dColor;
        age = dAge;
    }

    void printInfo() {
        System.out.println(name + " " + breed + " " + color + " " + age);
    }

   /* public static void main(String[] args) {

    Dog d1 = new Dog();
    d1.name ="Leo";
    d1.color = "White";
    d1.breed = "German";
    d1.age = 2;
    d1.printInfo();
    }

    */
}

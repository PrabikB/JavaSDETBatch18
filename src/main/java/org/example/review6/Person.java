package org.example.review6;

public class Person {
    String name;
    int age;
    double weight;
    double height;

     void eat(){
         System.out.println("Eating......");
    }
    String getName(){
         return name;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Paul Les";
        p.age = 32;
        p.height = 5.8;
        p.weight = 180;
        System.out.println(p.name);
        p.eat();
        String n = p.getName();
        System.out.println(n);

    }

}

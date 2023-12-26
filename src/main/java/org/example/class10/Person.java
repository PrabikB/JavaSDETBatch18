package org.example.class10;

public class Person {

    String name;
    char gender;
    int age;
    String race;
    double height;



    void walk(){
        System.out.println("Walking in the park");
    }
    void sleep(){
        System.out.println("Sleeping on bed");
    }
    void eat(){
        System.out.println("Eating Mo:Mo");
    }

    public static void main(String[] args) {
        Person mySelf = new Person();

        mySelf.name = "Bikal";
        mySelf.gender = 'M';
        mySelf.age = 32;
        mySelf.race = "Asian";
        mySelf.height = 5.8;

        System.out.println(mySelf.name);
        System.out.println(mySelf.gender);
        System.out.println(mySelf.age);
        System.out.println(mySelf.race);
        System.out.println(mySelf.height);

        mySelf.walk();
        mySelf.sleep();
        mySelf.eat();

    }

}


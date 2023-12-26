package org.example.class14;

public class Person {
    static int noOfEyes = 2;
    String name;
    int age;
    double weight;
//Instance Method
    void printInfo(){
        System.out.println(name+" "+age+" "+weight);
    }

    //Static Method
    static void printNoOfEyes(){
        System.out.println(noOfEyes);
    }

    public static void main(String[] args) {
        Person p1= new Person();
        p1.name = "Paul";
        p1.age =35;
        p1.weight = 170;
        p1.printInfo();
        System.out.println(Person.noOfEyes);
        Person.noOfEyes = 3;

        Person p2 = new Person();
        p2.name = "Les";
        p2.age =32;
        p2.weight = 180;
        p2.printInfo();
        System.out.println(Person.noOfEyes);

        Person.printNoOfEyes();


    }
}

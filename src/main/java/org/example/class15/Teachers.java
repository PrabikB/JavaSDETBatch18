package org.example.class15;

public class Teachers {
    private String name;
    private  String address;

    private int age;
    private double weight;

    public Teachers(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public Teachers(String name, String address, int age, double weight) {
        this(name, address, age);
        this.weight = weight;
    }
    void printInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        Teachers t = new Teachers("Asghar","Pakistan",30);
        t.printInfo();

    }
}


package org.example.class18;

public class Person {
    private String name;
    private int age;
    private double weight;

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }
    public void printInfo(){
        System.out.println(name+" "+age+" "+weight);
    }
}
class Student extends Person{
    private double marks;
    public Student(String name, int age, double weight,double marks) {
        super(name, age, weight);
        this.marks = marks;
    }
    public void printMarks(){
        System.out.println(marks);
    }
    public void printInfo(){
        super.printInfo();
        System.out.println(marks);
    }

}

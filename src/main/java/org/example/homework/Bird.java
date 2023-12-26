package org.example.homework;

public class Bird {
    /*Create a Bird class create 4 fields and use the
Bird class as parent class and create 2 classes
Using it one sparrow and one parrot use constructors make fields private and define
printInfo methods as well create the object of each class and call the methods
     */
    private String name;
    private String bSize;
    private String color;
    private int age;
    public Bird(String name, String bSize,String color,int age){
        this.name = name;
        this.bSize = bSize;
        this.color = color;
        this.age = age;
        }
    public void printInfo(){
        System.out.println("Bird name: "+name+"   ||   Bird size: "+bSize+"   ||   Bird color: "+color+"   ||   Bird age: "+age);
    }
}
class Sparrow extends Bird{
    public Sparrow(String name,String bSize,String color,int age){
        super(name,bSize,color,age);
    }
}
class Parrot extends Bird{
    public Parrot(String name, String bSize,String color,int age){
        super(name,bSize,color,age);
    }
}

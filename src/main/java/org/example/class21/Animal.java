package org.example.class21;

public abstract class Animal {

    private String name;
    private String color;
    static int age = 2;
   abstract void eat();

   public Animal(String name, String color){
       this.name = name;
       this.color = color;
   }
    public void sleep(){
        System.out.println("Animals sleep");
    }
    public abstract void speak();
    //public abstract String print(String str);

    public void printInfo(){
        System.out.println(name+" "+" "+color+" "+" "+age);
    }
}
class Dog extends Animal{

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("Dogs like to eat meat");
    }

    @Override
   public void speak() {
        System.out.println("Wuff Wuffff");
    }
}
class Cat extends Animal{
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat fish");
    }

    @Override
    public void speak() {
        System.out.println("Meow Meow");
    }
}
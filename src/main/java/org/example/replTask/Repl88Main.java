package org.example.replTask;
public class Repl88Main {
   /* Create a Class Main
    In this class, you should specify the following attributes: breed, name, color,
    and following behaviors: bark(), run(), play().
    Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
    The output of the program should be as following:
    Husky can bark
    Husky can run
    Husky can play
    Bulldog can bark
    Bulldog can run
    Bulldog can play
    Labrador can bark
    Labrador can run
    Labrador can play
    */
    String breed;
    String name;
    String color;

    void bark(){
        System.out.println(breed +" can bark");
    }
    void run(){
        System.out.println(breed +" can run");
    }
    void play(){
        System.out.println(breed +" can play");
    }

    public static void main(String[] args) {
        Repl88Main dog1 = new Repl88Main();
        dog1.breed = "Husky";
        dog1.name = "Hunter";
        dog1.color = "Black&White";
        dog1.bark();
        dog1.run();
        dog1.play();
        System.out.println("***************************");
        Repl88Main dog2 = new Repl88Main();
        dog2.breed = "Bulldog";
        dog2.name = "Leo";
        dog2.color = "Brown";
        dog2.bark();
        dog2.run();
        dog2.play();
        System.out.println("****************************");
        Repl88Main dog3 = new Repl88Main();
        dog3.breed = "Labrador";
        dog3.name = "Charlie";
        dog3.color = "White";
        dog3.bark();
        dog3.run();
        dog3.play();



    }


}

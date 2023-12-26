package org.example.homework;

public class HomeWork14 {
    /* Create an array of names and store all names of your group.
    Then print your name from that array. (use 2 different ways of creating an array).

     */
    public static void main(String[] args) {

        String[] names = {"Bikal", "Prabik", "Paru", "Vevaan", "Easter"};

        System.out.println("You name is "+names[3]);

        String[] name = new String[5];
        name [0]="Bikal";
        name [1]="Prabik";
        name [2]="Paru";
        name [3]="Vevaan";
        name [4]="Easter";

        System.out.println("You name is "+name[2]);

    }
}

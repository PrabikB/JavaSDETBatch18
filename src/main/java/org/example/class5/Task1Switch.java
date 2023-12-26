package org.example.class5;

import java.util.Scanner;

public class Task1Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter you country");
        String country=sc.nextLine();

       switch (country){
           case ("USA"):
           System.out.println("English");
           break;
           case ("Nepal"):
               System.out.println("Nepali");
               break;
           case ("India"):
               System.out.println("Hindi");
               break;
           case ("Japan"):
               System.out.println("Japanese");
               break;
           case ("France"):
                   System.out.println("French");
                   break;
           default:
               System.out.println("Invalid Input");
       }


    }
}

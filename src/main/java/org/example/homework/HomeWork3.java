package org.example.homework;

import java.util.Scanner;

public class HomeWork3 {
    /*Prompt the user to enter person heights in inches.
    Person should be classified as one of the following:
     • short (under 60 inch)
     • medium(between 60 -72 inch)
     • tall (over 72 inch)
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        double height = sc.nextDouble();

        if(height<60){
            System.out.println("You are short");
        }else if(height>=60 && height<=72){
            System.out.println("You are medium");
        }else if(height>72){
            System.out.println("You are tall");
        }
    }
}

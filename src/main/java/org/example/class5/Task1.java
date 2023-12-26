package org.example.class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        double height = sc.nextDouble();

        if(height<60){
            System.out.println("Short");
        }else if(height>=60 && height<=72){
            System.out.println("medium");
        }else{
            System.out.println("tall");
        }
    }
}

package org.example.homework;

import java.util.Scanner;

public class HomeWork4 {
    /*Ask user to enter a number and then categorize
      if number is small,medium or large
      -Small number is value between 1 and 10
      -Medium number is value between 11 and 100
      -Large number is value between 101 and 1000

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        if(num>=1 && num<=10 ){
            System.out.println("The number you entered is small number.");
        }else if(num>10 && num<=100){
            System.out.println("The number you entered is medium number.");
        }else if(num>=101 && num<=1000){
            System.out.println("The number you entered is large number");
        }

    }

}

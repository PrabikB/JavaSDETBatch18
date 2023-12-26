package org.example.class4;

import java.util.Scanner;

public class Task5Scanner {
    public static void main(String[] args) {
        /* Write a program to ask user to enter numbers of worked years and annual salary.
        If user worked for more or equals to 5years than user is eligible for the bonus,
        otherwise he is not. Once user is eligible and salary is larger than 50000 than
        bonus=5000, otherwise bonus=3000.
        */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of worked years");
        int workedYears=sc.nextInt();

        System.out.println("Enter your annual salary");
        int annualSalary=sc.nextInt();

        if(workedYears>=5){
            System.out.println("You are eligible for the bonus");
            if(annualSalary>50000){
                System.out.println("Your bonus is 5000");
            }else{
                System.out.println("Your bonus is 3000");
            }
        }else{
            System.out.println("You are not eligible");
        }

    }
}

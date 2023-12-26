package org.example.class4;

import java.util.Scanner;

public class Task1Scanner {
    public static void main(String[] args) {
        System.out.println("What is the amout of loan is needed?");
        Scanner sc= new Scanner(System.in);

        double loanAmount = sc.nextDouble();

        if(loanAmount<=200000){
            System.out.println("I will lend the money");
        }else {
            System.out.println("Reject the client");
        }

    }
}

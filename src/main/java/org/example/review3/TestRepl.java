package org.example.review3;

import java.util.Scanner;

public class TestRepl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers 4 5 and 14");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The largest number is " + num1);
            } else {
                System.out.println("The largest number is " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("The largest number is " + num2);
            } else {
                System.out.println("The largest number is " + num3);
            }
        }


    }
}


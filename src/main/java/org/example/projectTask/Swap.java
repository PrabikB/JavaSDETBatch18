package org.example.projectTask;

public class Swap {
    // Write a program to swap 2 numbers without a temporary variable

    public static void main(String[] args) {
         int num1 = 20;
         int num2 = 23;

         num1 = num1 - num2;
         num2 = num1 + num2;
         num1 = num2 -num1;

        System.out.println(num1);
        System.out.println(num2);
    }
}

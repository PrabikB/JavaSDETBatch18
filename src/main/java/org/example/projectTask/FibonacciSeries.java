package org.example.projectTask;

public class FibonacciSeries {
    // Write a Java Program to print the first 10 numbers of Fibonacci series.
    public static void main(String[] args) {
        int num = 9;
        int firstNumber = 0;
        int secondNumber = 1;

        for (int i = 0; i <=num; i++) {
            System.out.print(firstNumber + " ");

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            }
        }
    }


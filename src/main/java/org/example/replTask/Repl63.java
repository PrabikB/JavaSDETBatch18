package org.example.replTask;

import java.util.Scanner;

public class Repl63 {
    /* Given the following inputs:
       int x;
       Write a for loop that will print out a series of numbers starting at 0 and
       ending at the x(value must be taken from a user), exclusive.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("In: ");
        int x = sc.nextInt();
        for(int i=0; i<x; i++ ){
            System.out.print(i+" ");
        }
    }
}

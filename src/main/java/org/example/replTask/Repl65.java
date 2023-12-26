package org.example.replTask;

import java.util.Scanner;

public class Repl65 {
    /* Given the following inputs:
       int x;
       Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("In: ");
        int x = sc.nextInt();

        for(int i = x; i>0; i--){
            System.out.print(i-1+" ");
        }

    }
}

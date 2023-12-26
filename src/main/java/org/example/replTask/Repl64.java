package org.example.replTask;

import java.util.Scanner;

public class Repl64 {
    /* You should input:
       int end;
       Write a for loop that will print out a series of numbers starting
       at 0 and ending at the doubled value of end(value must be taken from a user), exclusive.
       Each number should be on the same line, separated by a space.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("In: ");
        int end = sc.nextInt();

        for(int i = 0; i<2*end; i++){
            System.out.print(i+" ");
        }

    }
}

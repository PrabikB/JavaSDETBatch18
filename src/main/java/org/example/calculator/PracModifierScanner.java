package org.example.calculator;

import java.util.Scanner;

public class PracModifierScanner {
    /*  Given the following inputs:
String s;
Write a for loop that will print out the reverse of the string.
Sample input/outputs:
In: manhattan
nattahnam
In: processor
rossecorp
In: racecar
racecar
     */

    public static void word(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rev = sc.nextLine();
        word(rev);
    }
}
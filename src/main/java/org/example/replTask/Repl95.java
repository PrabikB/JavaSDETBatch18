package org.example.replTask;

import java.util.Scanner;

public class Repl95 {
    /*Using Scanner class input string value.
Print out the following: "The first 3 letters of \_\_\_ is ___"
For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string value");
        String str = sc.nextLine();

        str = str.substring(0,3);
        System.out.println("The first 3 letters of value is "+str);
    }
}

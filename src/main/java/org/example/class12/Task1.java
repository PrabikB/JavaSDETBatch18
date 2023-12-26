package org.example.class12;

public class Task1 {
    /* Create a String that will hold sentence.
    Write a program to get a new String without any spaces.

     */
    public static void main(String[] args) {
        String str = "Today is Java Class";
        String newStr = str.replaceAll(" ","");
        System.out.println(newStr);

    }
}

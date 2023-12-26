package org.example.homework;

public class HomeWork28 {
    /*Create a method that will accept a String as a parameter and return a
    new String that consist only of vowels. Method should be available inside
    the class only where it was declared and executed by calling it is name.
     */
    private static String vowels(String v){
        return v.replaceAll("[^aeiouAEIOU]","");
    }

    public static void main(String[] args) {
        System.out.println(vowels("Umbrella"));
    }
}

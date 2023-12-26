package org.example.calculator;

public class StringDemo {
    public static void main(String[] args) {
        String str = "My phone number is 911";
        str = str.replaceAll("[^9-9]","");
        System.out.println(str);
    }
}

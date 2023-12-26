package org.example.class12;

public class E1StringDemo {
    public static void main(String[] args) {
        String str ="It's Savera's Birthday today. It's Sunday. Today is Java Class";
       String [] strArr =  str.split("[.]");
        System.out.println(strArr[0]);
        System.out.println(strArr[1].trim());

    }
}

package org.example.class11;

public class E7StringDemo {
    public static void main(String[] args) {

        String str = "  HELLO   ";
        System.out.println(str.toLowerCase().trim().length());
        System.out.println(str.toLowerCase().length());
        System.out.println(str.trim().toLowerCase().equals("hello"));


    }
}

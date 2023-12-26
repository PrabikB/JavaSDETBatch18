package org.example.review6;

public class E12StringDemo {
    public static void main(String[] args) {
        String str = "My name is Bikal my number is 1232343456";
        String number = str.replaceAll("[^0-9]","");
        System.out.println(number);
        StringBuilder stringBuilder = new StringBuilder("Java");



    }
}

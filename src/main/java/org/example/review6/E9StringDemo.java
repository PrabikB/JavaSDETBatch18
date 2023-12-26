package org.example.review6;

public class E9StringDemo {
    public static void main(String[] args) {
        String str = "this one should be false";
        System.out.println(str.indexOf('o')); //checks left to right
        System.out.println(str.lastIndexOf('o')); //checks right to left

    }
}

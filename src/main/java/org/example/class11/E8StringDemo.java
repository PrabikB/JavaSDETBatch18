package org.example.class11;

public class E8StringDemo {
    public static void main(String[] args) {

        String str = "Today is Saturday";

       System.out.println(str.indexOf('T'));
       System.out.println(str.indexOf('o'));System.out.println(str.indexOf('S'));
       System.out.println(str.indexOf('a')); //gives you the index of first letter
       System.out.println(str.indexOf('Z')); //give you -1 if the letter is not present

        }
    }


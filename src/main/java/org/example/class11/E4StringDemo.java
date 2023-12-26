package org.example.class11;

public class E4StringDemo {
    public static void main(String[] args) {

        String str = "Now I love Java, Java is great";
        System.out.println(str.startsWith("Now"));
        //System.out.println(str.startsWith("N"));
        //System.out.println(str.startsWith(" N"));
        //System.out.println(str.startsWith("I"));
        //System.out.println(str.startsWith(""));

        System.out.println(str.endsWith("great"));
        //System.out.println(str.endsWith("Java"));

        System.out.println(str.contains("Java"));
        //System.out.println(str.contains("Python"));




    }
}
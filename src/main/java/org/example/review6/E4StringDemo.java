package org.example.review6;

public class E4StringDemo {
    public static void main(String[] args) {

        String str = "502-1111-1234";
        System.out.println();
        if(str.startsWith("502")){
            System.out.println("Number is from Kentucky");
        }
        System.out.println(str.endsWith("4"));
    }
}

package org.example.class11;

public class Task2 {
    public static void main(String[] args) {

        String str = "Java is Fun";
        //count how many times letter "a" has has appeared in the string
        int c = 0;

        for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i) =='a'){
               c++;
            }
        }
        System.out.println(c);
    }
}

package org.example.class11;

public class Task3 {
    public static void main(String[] args) {

        String str = "Today is Saturday";

        //print all the index of letter 'a' from above string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                System.out.println(i);
            }
        }
    }
}

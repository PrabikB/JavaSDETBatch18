package org.example.class12;

public class Task3 {
    /* You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
       How would you find out how many sentences are in that String?
     */
    public static void main(String[] args) {
        String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(str.split("[?]").length);

    }

}


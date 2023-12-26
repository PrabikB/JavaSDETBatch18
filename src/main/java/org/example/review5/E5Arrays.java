package org.example.review5;

import java.util.Arrays;

public class E5Arrays {
    public static void main(String[] args) {

        String[] students = new String[5];
        students[0] = "Bikal";
        students[1] = "Bikesh";
        students[2] = "Pukar";
        students[3] = "Hari";
        students[4] = "Sangel";

        for (int i = 0; i < students.length; i++) {

            if(students[i].equals("Bikesh")){
                students[i] = "Good Student";
            }

        }
        //If you just want to print the items in a row from array we can use this.
        System.out.println(Arrays.toString(students));

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
            }
    }
}
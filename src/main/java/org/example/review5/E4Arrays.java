package org.example.review5;

public class E4Arrays {
    public static void main(String[] args) {
        String [] students = new String[5];
        students[0] = "Bikal";
        students[1] = "Bikesh";
        students[2] = "Pukar";
        students[3] = "Hari";
        students[4] = "Sangel";

        for( int i = 0; i<students.length; i++){
            System.out.print(students[i]+ " ");
        }
    }
}

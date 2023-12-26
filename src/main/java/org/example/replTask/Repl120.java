package org.example.replTask;

public class Repl120 {
    /*  Declare 3 instance variables to hold:
year, school name and batch #
Access variables from the main method and assign specific values to them
Print values of your variables in the following format:
**Expected Output:**
I am a student of batch 9 studying at Syntax in the year of 2021
     */
    private int year;
    private String schoolName;
   private int batchNumber;

    public static void main(String[] args) {
        Repl120 student = new Repl120();
        student.year = 2021;
        student.schoolName = "SYNTAX";
        student.batchNumber = 9;

        System.out.println("I am a student of batch " +student.batchNumber+" studying at "+student.schoolName+" in the year "+student.year);
    }
}

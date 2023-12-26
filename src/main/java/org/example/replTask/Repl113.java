package org.example.replTask;

public class Repl113 {
    /*Step1: Create a method that will accept with 2 parameters of integer type
Step2: Write the logic in that method in println statement to print hours and minutes
Step3: Call the method
**Expected Output:**
11:30
     */
    public static void hourMinute(int h, int m){
        System.out.println(h+":"+m);
    }

    public static void main(String[] args) {
        hourMinute(11,30);
    }
}

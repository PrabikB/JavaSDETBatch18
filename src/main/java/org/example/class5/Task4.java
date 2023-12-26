package org.example.class5;

import java.util.Scanner;
/*
Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season ______”.

 */

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String birthMonth=sc.next();

        if (birthMonth.equalsIgnoreCase("March") || birthMonth.equalsIgnoreCase("April") || birthMonth.equalsIgnoreCase("May")){
            System.out.println("Spring");
        }else if(birthMonth.equalsIgnoreCase("June") ||birthMonth.equalsIgnoreCase("July") || birthMonth.equalsIgnoreCase("August")){
            System.out.println("Summer");
        }else if(birthMonth.equalsIgnoreCase("September") || birthMonth.equalsIgnoreCase("October") || birthMonth.equalsIgnoreCase("November") ){
            System.out.println("Fall");
        }else if (birthMonth.equalsIgnoreCase("December") || birthMonth.equalsIgnoreCase("January") || birthMonth.equalsIgnoreCase("February")){
            System.out.println("Winter");
        }else{
            System.out.println("Invalid Input");
        }
    }
}

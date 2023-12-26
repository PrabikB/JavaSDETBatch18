package org.example.replTask;

import java.util.Scanner;

public class Repl76 {
    /* Write a program that creates a String array with size 7.

Ask the user to input Days of a week beginning with Sunday using Scanner class.

Add these inputs to your array and then print all values from that array

Example:

Please enter day 1 of the week

Sunday

Please enter day 2 of the week

Monday

Please enter day 3 of the week

Tuesday etc

**Example Output:**

Please enter day 1 of the week

Sunday

Please enter day 2 of the week

Monday

Please enter day 3 of the week

Tuesday

Please enter day 4 of the week

Wednesday

Please enter day 5 of the week

Thursday

Please enter day 6 of the week

Friday

Please enter day 7 of the week

Saturday

Sunday

Monday

Tuesday

Wednesday

Thursday

Friday

Saturday

     */
    public static void main(String[] args) {

        String []  daysOfWeek= new String[7];
        Scanner sc = new Scanner(System.in);

        daysOfWeek[0]="Sunday";
        daysOfWeek[1]="Monday";
        daysOfWeek[2]="Tuesday";
        daysOfWeek[3]="Wednesday";
        daysOfWeek[4]="Thursday";
        daysOfWeek[5]="Friday";
        daysOfWeek[6]="Saturday";

        for(int i=0; i<7; i++){
            System.out.println("Please enter day " +(i+1)+" of the week");
            daysOfWeek[i] = sc.nextLine();
        }

        for(int j=0; j<7; j++){
            System.out.println(daysOfWeek[j]);
        }

        }

        }



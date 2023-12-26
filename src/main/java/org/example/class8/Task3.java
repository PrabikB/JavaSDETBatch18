package org.example.class8;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers={10,15,20,18,9,60,22,30};
        //show the sum of even numbers and odd numbers
        //seperately
        int evenNum=0, oddNum=0;

        for (int i : numbers) {
            if (i % 2 == 0) {
                evenNum = evenNum+i;
            } else {
                oddNum = oddNum+i;
            }
        }

        // Print the sums
        System.out.println("The sum of even numbers is " + evenNum);
        System.out.println("The sum of odd numbers is " + oddNum);
    }


    }


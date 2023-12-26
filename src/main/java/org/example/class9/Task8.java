package org.example.class9;

public class Task8 {
    // Create a 2D array of integer type and store numbers in 3 row and 3 column
    //print the sum of all numbers all numbers
    public static void main(String[] args) {
        int[][] num={
                {54,87,55,},
                {23,74,90},
                {2,68,21}
        };
        int sum=0;
        for (int i = 0; i<num.length; i++){
            for (int j =0; j<num[i].length; j++) {
                sum = sum + num[i][j];
            }
        }
        System.out.println("The sum of all numbers is: "+sum);
    }
}

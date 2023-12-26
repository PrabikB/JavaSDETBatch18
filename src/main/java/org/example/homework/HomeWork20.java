package org.example.homework;

public class HomeWork20 {
    /*Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
      Print the sum of all numbers.
     */
    public static void main(String[] args) {
        int[][] numbers={
                {7,13,19},
                {91,11,25},
                {3,29,48}};
        int sum = 0;

        for (int i=0; i< numbers.length; i++){
            for(int j =0; j< numbers[i].length; j++){
                sum = sum+numbers[i][j];
            }
        }
        System.out.println("The sum of all numbers is "+sum);
    }
}

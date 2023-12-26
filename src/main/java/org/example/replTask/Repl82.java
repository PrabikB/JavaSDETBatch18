package org.example.replTask;

public class Repl82 {
    /* Write a program that will print the sum of all elements in 2D array.
            {-5,-2,-3,7},
			{1,-5,-2, 2},
			{1,-2, 3,-4}
     */
    public static void main(String[] args) {
         int [][] num = {
                 {-5, -2, -3, 7},
                 {1, -5, -2, 2},
                 {1, -2, 3, -4}
         };
         int sum = 0;

         for (int i = 0; i<num.length; i++) {
             for (int j = 0; j < num[i].length; j++) {
                 sum = sum + num[i][j];
             }
         }
        System.out.println("The sum of all the elements in 2D array is : " + sum);
    }
}

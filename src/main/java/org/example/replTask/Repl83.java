package org.example.replTask;
public class Repl83 {
    /* Write a program that calculates the sum of elements from each row
      in a 2D array and adds them into array of integers
For example, if we run rowSums for the following 2D array:
{ {1,1,2}, //sum = 4
  {3,1,2}, //sum = 6
  {3,5,3}, //sum = 11
  {0,1,2}  //sum = 3        }
Then we should get the following array back:
4
6
11
3
     */
    public static void main(String[] args) {

        int[][] num = {
                {1, 1, 2},
                {3, 1, 2},
                {3, 5, 3},
                {0, 1, 2}
        };

        for (int i =0; i<num.length; i++){
            int sum = 0;
            for (int j = 0; j<num[i].length; j++){
                sum = sum + num[i][j];
            }
            System.out.println("The sum of each row = " + sum);
        }
    }
}
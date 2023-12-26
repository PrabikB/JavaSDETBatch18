package org.example.replTask;

public class Repl84 {
    /*Write a program that prints the total number of elements that are negative AND odd
**Output:**
for example -3 is both negative and odd
3
     */
    public static void main(String[] args) {
        int[][] numbers = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        int negetive = 0;
        int odd = 0;


        for (int i=0; i<numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] < 0) {
                    negetive++;
                } else if (numbers[i][j] % 2 != 0) {
                    odd++;
                }
            }
        }
        int negetiveAndOdd = negetive + odd;

        System.out.println("The total number of elements that are negetive and odd is " +negetiveAndOdd );

    }
}

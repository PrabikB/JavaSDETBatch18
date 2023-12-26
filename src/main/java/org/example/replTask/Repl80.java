package org.example.replTask;

public class Repl80 {
    /*Write a program to double the values of every element in the array and print it out.
**Example Output:**
2.8 4.0 6.6 4.0
8.0 3.0 12.2 2.0
2.4 6.2 8.0 3.2
     */
    public static void main(String[] args) {
        double [][] num = {
                {2.8, 4.0, 6.6, 4.0},
                {8.0, 3.0, 12.2, 2.0},
                {2.4, 6.2, 8.0, 3.2}
        };
        for(int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] *= 2;
            }
        }
        for (int i = 0; i<num.length; i++){
            for(int j= 0; j < num[i].length; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}

package org.example.replTask;

public class Repl79 {
    /*Write a program to print values from a 2D array
**Example Output:**
1.4 2.0 3.3 2.0
4.0 1.5 6.1 1.0
1.2 3.1 4.0 1.6
     */
    public static void main(String[] args) {
        double [][] num = {
                {1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6}
        };
        for (int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-----using enhanced loop-----");
        System.out.println();

        for (double [] numbers:num){
            for( double decimal:numbers){
                System.out.print(decimal+" ");
            }
            System.out.println();
        }
    }
}

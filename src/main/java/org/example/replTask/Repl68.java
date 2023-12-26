package org.example.replTask;

public class Repl68 {
    /* Write a program to print out the pattern:

 **Expected output:**

 1 2 3 4 5
 1 2 3 4 5

     */
    public static void main(String[] args) {

        for(int i = 1; i<=2; i++){
            for(int j = 1; j<=5; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

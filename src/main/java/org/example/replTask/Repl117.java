package org.example.replTask;

public class Repl117 {
    /*Create a method with the following specs:
Returns:
an integer
Name:
sumEvenToX
Parameters:
an integer called "x"
Purpose:
calculate the sum of the EVEN integers from 1 to x (including x)
Examples:
sumEvenToX(5) ==> 6
sumEvenToX(8) ==> 20
     */

     public static int sumEvenX(int x){
         int sumEven = 0;

         for (int i = 2; i <=x ; i+=2) {
             sumEven +=i;
         }
         return sumEven;
    }

    public static void main(String[] args) {
        System.out.println(sumEvenX(5));
        System.out.println(sumEvenX(8));
    }
}

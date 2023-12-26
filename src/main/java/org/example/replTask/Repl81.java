package org.example.replTask;

public class Repl81 {
    /*Write a program that prints the highest value in the array.
**Expected Output:**
input [5,4,8]
8
     */
    public static void main(String[] args) {
        int [] num={5,4,8};
        int highestValue = 0;

        for (int i = 0; i<num.length; i++){
           if( num[i]>highestValue){
               highestValue = num[i];
           }
        }
        System.out.println(highestValue);
    }

}
